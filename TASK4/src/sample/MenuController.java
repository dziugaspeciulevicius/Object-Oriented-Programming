package sample;

import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Classes.Dish;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuController<input> {
    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private AnchorPane topbar;
    @FXML private AnchorPane menuDishes;
    @FXML private ImageView shoppingCart;
    @FXML private Button openShoppingCartButton;
    @FXML private ImageView foodPicture;
    @FXML private Label foodName;
    @FXML private Label foodPrice;
    @FXML private Button addDishToCart;
    @FXML private TableView<Dish> DishTable;
    //List of dishes
    ObservableList<Dish> dishList = FXCollections.observableArrayList();

    //Cart manager?
    //Cart cart;

//    void loadDishes(){
//        dishes = Main.LoadDishes();
//    }

    @FXML
    void openShoppingCart(ActionEvent event) {
        try {
            Parent shoppingCartWindow = FXMLLoader.load(getClass().getResource("ShoppingCartWindow.fxml"));
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("Shopping Cart");
            window.setScene(new Scene(shoppingCartWindow));
            window.setResizable(false);
            window.show();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("CAN'T LOAD A WINDOW");
            alert.setContentText("Window you are trying to open cannot be reached at the moment!");
            alert.showAndWait();
        }
    }

    @FXML
    void addDishToCartAction(ActionEvent event) {

    }
}