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
    @FXML private ImageView foodPicture1;
    @FXML private ImageView foodPicture2;
    @FXML private ImageView foodPicture3;
    @FXML private ImageView foodPicture4;
    @FXML private ImageView foodPicture5;
    @FXML private ImageView foodPicture6;
    @FXML private Label foodName1;
    @FXML private Label foodName2;
    @FXML private Label foodName3;
    @FXML private Label foodName4;
    @FXML private Label foodName5;
    @FXML private Label foodName6;
    @FXML private Label foodPrice1;
    @FXML private Label foodPrice2;
    @FXML private Label foodPrice3;
    @FXML private Label foodPrice4;
    @FXML private Label foodPrice5;
    @FXML private Label foodPrice6;
    @FXML private Button aboutDish1;
    @FXML private Button aboutDish2;
    @FXML private Button aboutDish3;
    @FXML private Button aboutDish4;
    @FXML private Button aboutDish5;
    @FXML private Button aboutDish6;
    @FXML private Button addDishToCart1;
    @FXML private Button addDishToCart2;
    @FXML private Button addDishToCart3;
    @FXML private Button addDishToCart4;
    @FXML private Button addDishToCart5;
    @FXML private Button addDishToCart6;

    //List of dishes
    ObservableList<Dish> dishes = FXCollections.observableArrayList();
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
    void aboutDish1Action(ActionEvent event) {

    }

    @FXML
    void addDishToCart1Action(ActionEvent event) {

    }

    @FXML
    void aboutDish2Action(ActionEvent event) {

    }

    @FXML
    void addDishToCart2Action(ActionEvent event) {

    }

    @FXML
    void aboutDish3Action(ActionEvent event) {

    }

    @FXML
    void addDishToCart3Action(ActionEvent event) {

    }

    @FXML
    void aboutDish4Action(ActionEvent event) {

    }

    @FXML
    void addDishToCart4Action(ActionEvent event) {

    }

    @FXML
    void aboutDish5Action(ActionEvent event) {

    }

    @FXML
    void addDishToCart5Action(ActionEvent event) {

    }

    @FXML
    void aboutDish6Action(ActionEvent event) {

    }

    @FXML
    void addDishToCart6Action(ActionEvent event) {

    }
}