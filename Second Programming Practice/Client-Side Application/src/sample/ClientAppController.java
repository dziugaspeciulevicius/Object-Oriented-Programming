package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.*;
import java.sql.*;

public class ClientAppController {

//    public ClientAppController() {
//        Driver.getConnection();
//    }

    @FXML private TableColumn<Item, String> itemListColumn;
    @FXML private TableView<Item> productTable;
    @FXML private Label usernameShow;
    @FXML private Label itemName;
    @FXML private ImageView itemPicture;
    @FXML private Label itemPrice;
    @FXML private Label itemDescription;
    @FXML private Label itemQuantity;
    @FXML private Button addToCartButton;
    @FXML private TableView<ShoppingCart> orderTable;
    @FXML private TableColumn<ShoppingCart, String> orderTableColumn;
    @FXML private Button deleteButton;
    @FXML private TextField discountCodeField;
    @FXML private Button discountCodeApplyButton;
    @FXML private Label subtotalPriceLabel;
    @FXML private Label totalPriceLabel;
    @FXML private TextField countryTextField;
    @FXML private TextField cityTextField;
    @FXML private TextField postalCodeTextField;
    @FXML private TextField addressTextField;
    @FXML private TextField apartmentTextField;
    @FXML private Button buyButton;

    public static ObservableList<Item> itemList = FXCollections.observableArrayList();
    public static ObservableList<Item> cartList = FXCollections.observableArrayList();
    public static ObservableList<Item> getItemList(){
        return itemList;
    }
    public static ObservableList<Item> getCartList(){
        return cartList;
    }
    ShoppingCart shoppingCart = new ShoppingCart();

    @FXML
    private void initialize(){
        //display items in the tables
        itemListColumn.setCellValueFactory(cellData -> cellData.getValue().itemNameProperty());
        //display selected items into the orders table
        orderTableColumn.setCellValueFactory(celLData -> celLData.getValue().itemNameProperty());


        showItems(null);
        showShoppingCart(null);

        productTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue)-> showItems(newValue));
        productTable.setItems(getItemList());

        //orderTable.getSelectionModel().selectedItemProperty().addListener(
        //(observable, oldValue, newValue)-> showShoppingCart(newValue));
        //This caused for prices to show 0.00 euros
    }

    private void showItems(Item item){
        if(item != null) {
            itemPicture.setImage((Image) item.getItemImage());
            itemName.setText(item.getItemName());
            itemDescription.setText(item.getItemDescription());
            itemPrice.setText(Double.toString(item.getItemPrice()));
            itemQuantity.setText(Integer.toString(item.getItemInventory()));
        } else {
            itemName.setText("---");
            itemDescription.setText("---");
            itemPrice.setText("---");
            itemQuantity.setText("---");
        }
    }

    private void showShoppingCart(ShoppingCart shoppingCart){
        if (shoppingCart != null) {
            subtotalPriceLabel.setText(Double.toString(shoppingCart.getFinalPrice()));
            totalPriceLabel.setText(Double.toString(shoppingCart.getFinalPriceVAT()));
        } else {
            subtotalPriceLabel.setText("");
            totalPriceLabel.setText("");
        }
    }

    @FXML
    void addToCartAction(ActionEvent event) {
        Item selection = productTable.getSelectionModel().getSelectedItem();
        if (selection != null) {
            int inventory = selection.getItemInventory() -1;
            selection.setItemInventory(inventory);
            //orderTable.getItems().add(new ShoppingCart(selection.getItemName(), selection.getItemDescription(),

            Connection conn;
            Statement stmt = null;
            PreparedStatement ps = null;

            try{
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:D:\\MY FILES\\Studies\\3 SEMESTER\\Object-Oriented-Programming\\Second Programming Practice\\data.db");
                conn.setAutoCommit(false);
                stmt = conn.createStatement();
                ps=conn.prepareStatement("UPDATE Item set item_inventory ='"+selection.getItemInventory()+"' where item_name ='"+selection.getItemName()+"'");
                ps.execute();
                conn.commit();
                shoppingCart.setShoppingCartArray(selection);
                orderTable.getItems().add(selection);
                conn.close();
            }catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );

            }
            System.out.println("Item added successfully");
        }
        setPrice();
    }

    @FXML
    void deleteItemAction(ActionEvent event) {
        ShoppingCart selection = orderTable.getSelectionModel().getSelectedItem();
        if (selection != null) {
            int inventory= selection.getQuantity() +1;
            selection.setQuantity(inventory);

            Connection conn;
            Statement stmt = null;
            PreparedStatement ps =null;
            try{
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:D:\\MY FILES\\Studies\\3 SEMESTER\\Object-Oriented-Programming\\Second Programming Practice\\data.db");
                conn.setAutoCommit(false);
                stmt = conn.createStatement();
                ps=conn.prepareStatement("UPDATE Item set item_inventory ='"+selection.getQuantity()+"' where item_name ='"+selection.getItemName()+"'");
                ps.execute();
                conn.commit();
                conn.close();
                //removes selected item from the order list
                shoppingCart.getShoppingCartArray().remove(selection);
                //removes selected item from the table view
                orderTable.getItems().remove(selection);
            }catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );

            }
            System.out.println("Item deleted successfully");
        }
        setPrice();
    }

    @FXML
    void buyButtonAction(ActionEvent event) {
        Driver.addToOrder();

    }

    @FXML
    void discountCodeApplyAction(ActionEvent event) {

    }

    //function to set final price
    private void setPrice(){
        //set price labels
        //formats to string
        String price = String.format("%.2f", shoppingCart.getFinalPrice());
        subtotalPriceLabel.setText(price);
        //with VAT

        price = String.format("%.2f", shoppingCart.getFinalPriceVAT());
        totalPriceLabel.setText(price);
    }
}
