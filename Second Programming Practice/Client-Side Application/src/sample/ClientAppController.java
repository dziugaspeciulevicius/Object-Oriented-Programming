package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

public class ClientAppController {

    @FXML private TableColumn<Item, String> nameColumn;
    @FXML private TableView<Item> productTable;
    @FXML private Label usernameShow;

    ShoppingCart shoppingCart = new ShoppingCart();

    public static ObservableList<Item> itemList = FXCollections.observableArrayList();
    public static ObservableList<Item> cartList = FXCollections.observableArrayList();
    public static ObservableList<Item> getItemList(){
        return itemList;
    }
    public static ObservableList<Item> getCartList(){
        return cartList;
    }

    @FXML
    private void initialize(){
        //display items in the tables
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().itemNameProperty());
        //display selected items into the orders table
        //orderColumn.setCellValueFactory(celLData -> celLData.getValue().dishNameProperty());

        showItems(null);
        //showShoppingCart(null);

        productTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue)-> showItems(newValue));
//        orderTable.getSelectionModel().selectedItemProperty().addListener(
//                (observable, oldValue, newValue)-> showShoppingCart(newValue));
        //This caused for prices to show 0.00 euros
        productTable.setItems(getItemList());
    }

    private void showItems(Item item){
        if(item != null) {
            itemPicture.setImage(item.getItemImage());
            foodName.setText(item.getItemName());
            dishDescription.setText(item.getItemDescription());
            foodPrice.setText(Double.toString(item.getItemPrice()));
        } else {
            foodName.setText("");
            dishDescription.setText("");
            foodPrice.setText("");
        }
    }



    User loggedUser;

    @FXML
    public void initData(User user) {

        loggedUser = user;
        usernameShow.setText(loggedUser.getUsername());
    }

    private void showUserName(User user) {
        if (user != null){
            usernameShow.setText(user.getUsername());
        } else {
            usernameShow.setText("No name to display");
        }
    }


}
