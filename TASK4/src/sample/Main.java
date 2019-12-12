package sample;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import java.io.*;
import java.sql.*;

public class Main extends Application {
//    @FXML
//    private TableView<Dish> dishTable;
//    private FileInputStream fis;

    public static ObservableList<Dish> dishList = FXCollections.observableArrayList();
    public static ObservableList<Dish> cartList = FXCollections.observableArrayList();

    public Main(){
        //Add some sample data
        Driver.ConnectionDB();
    }

    public static ObservableList<Dish> getDishList(){
        return dishList;
    }
    public static ObservableList<Dish> getCartList(){
        return cartList;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Menu");
        Parent root = FXMLLoader.load(getClass().getResource("MenuWindow.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) throws SQLException {
        launch(args);
    }
}