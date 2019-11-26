package sample;
import Classes.Constraints;
import Classes.Dish;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.util.List;
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


    public static void main(String[] args) throws Exception {
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
                                "\nDescription: " + rs.getString(3));
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



//-------TEACHER-DATABASE-EXAMPLE----------------------------------------------------------
/*

public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:test.db";
            conn = DriverManager.getConnection(url);

            while (true) {
                System.out.println("\n1 - List the content");
                System.out.println("2 - Add new record");
                System.out.println("3 - Update record");
                System.out.println("4 - Delete record");
                System.out.println("5 - Exit application\n");
                System.out.print("Enter menu item number: ");
                Scanner scanner = new Scanner((System.in));
                String item = scanner.nextLine();

                if (item.equals("1")) {
                    // Nuskaitymas iš DB
                    String sql = "SELECT * FROM Preke";
                    Statement stmt  = conn.createStatement();
                    ResultSet rs    = stmt.executeQuery(sql);
                    while (rs.next()) {
                        System.out.println("Pavadinimas: " + rs.getString(1) +  "\tKaina: " + rs.getDouble(2));
                    }
                }
                else if (item.equals("2")) {
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    String priceStr = scanner.nextLine();
                    double price = Double.parseDouble(priceStr);

                    // Įrašymas į DB parametrizuota užklausa (rekomenduojamas būdas)
                    String sql = "INSERT INTO Preke VALUES(?,?)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, name);
                    pstmt.setDouble(2, price);
                    pstmt.executeUpdate();
                }
                else if (item.equals("3")) {
                    System.out.print("Enter item name, you want to modify: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter new item price: ");
                    String priceStr = scanner.nextLine();
                    double price = Double.parseDouble(priceStr);

                    // Įrašo DB atnaujinimas parametrizuota užklausa (rekomenduojamas būdas)
                    String sql = "update Preke set price=? where name=?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(2, name);
                    pstmt.setDouble(1, price);
                    pstmt.executeUpdate();
                }
                else if (item.equals("4")) {
                    System.out.print("Enter item name, you want to delete: ");
                    String name = scanner.nextLine();

                    // Įrašo šalinimas iš DB parametrizuota užklausa (rekomenduojamas būdas)
                    String sql = "delete from Preke where name=?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, name);
                    pstmt.executeUpdate();
                }
                else
                    break;
            }
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        finally {
            if (conn.isClosed() == false) {
                conn.close();
            }
        }
    }

*/