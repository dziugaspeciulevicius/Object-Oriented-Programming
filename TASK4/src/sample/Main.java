package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class Main extends Application {

    private FileInputStream fis;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MenuWindow.fxml"));
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:dish.db";
            conn = DriverManager.getConnection(url);
            System.out.println("\nConnected!");

            while (true) {
                System.out.println("\n1 - List the content");
                System.out.println("2 - I'm done. Open the interface for me pls. Thank you. \n");
                System.out.print("Enter menu item number: ");
                Scanner scanner = new Scanner((System.in));
                String item = scanner.nextLine();

                if (item.equals("1")) {
                    //List<Dish> dishList;
                    String sql = "SELECT * FROM Dish";
                    Statement stmt  = conn.createStatement();
                    ResultSet rs    = stmt.executeQuery(sql);
                    while (rs.next()) {
                        //String current = rs.getString("1") + rs.getDouble(2) + rs.getString(3);
                        //dishList.add(current);
                        System.out.println("Name: " + rs.getString(1) +  "\nPrice: " + rs.getDouble(2) +
                                "\nDescription: " + rs.getString(3) + "\nPicture: " + rs.getString(4));
                    }
                } else
                    break;
            }
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        finally {
            launch(args);
            if (conn.isClosed() == false) {
                conn.close();
                System.out.println("Connection closed");
            }
        }
    }
}