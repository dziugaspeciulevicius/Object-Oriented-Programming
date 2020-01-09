package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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

        showItems(null);

        productTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue)-> showItems(newValue));
        productTable.setItems(getItemList());

        //display selected items into the orders table
        orderTableColumn.setCellValueFactory(celLData -> celLData.getValue().itemNameProperty());
        /*showShoppingCart(null);*/
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

   /* private void showShoppingCart(ShoppingCart shoppingCart){
        if (shoppingCart != null) {
            subtotalPriceLabel.setText(Double.toString(shoppingCart.getFinalPrice()));
            totalPriceLabel.setText(Double.toString(shoppingCart.getFinalPriceVAT()));
        } else {
            subtotalPriceLabel.setText("");
            totalPriceLabel.setText("");
        }
    }*/

    @FXML
    void addToCartAction(ActionEvent event) {

    }
}
