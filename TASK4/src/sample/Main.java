package sample;
import Classes.Dish;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class Main extends Application {

    private FileInputStream fis;

    public static ObservableList<Dish> dishList = FXCollections.observableArrayList();

    public Main(){
        Driver.ConnectionDB();
    }

    public static ObservableList<Dish> getDishList(){
        return dishList;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MenuWindow.fxml"));
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) throws SQLException {
        launch(args);
    }
}