package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.sql.*;

public class Driver {

    public static void ConnectionDB() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:dish.db");
            conn.setAutoCommit(false);

            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Dish");

            while (rs.next()) {
                String dishName = rs.getString("dish_name");
                String dishDescription = rs.getString("dish_description");
                Double dishPrice = rs.getDouble("dish_price");
                String picture = rs.getString("dish_picture");
                Image Images = new Image(picture);

                Main.dishList.add(new Dish(dishName, dishDescription, dishPrice, picture));
            }
            rs.close();
            stmt.close();
            conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error on building data");
                System.exit(0);
            }
        System.out.println("DB OK");
    }
}
/*-----------------------------------------------------------------------------------------*/
//public static void ConnectionDB(){
//    Connection conn = null;
//    Statement stmt = null;
//    try {
//        String url = "jdbc:sqlite:dish.db";
//        conn = DriverManager.getConnection(url);
//
//        //data = FXCollections.observableArrayList();
//
//        stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM Dish;");
//
//        while ( rs.next() ) {
//            String dishName = rs.getString("dish_name");
//            String dishDescription = rs.getString("dish_description");
//            double dishPrice = rs.getInt("dish_price");
//            String picture = rs.getString("dish_picture");
//
//            Main.dishList.add(new Dish(dishName, dishDescription, dishPrice, picture));
//        }
//        rs.close();
//        stmt.close();
//        conn.close();
//    } catch ( Exception e ) {
//        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//        System.exit(0);
//    }
//    System.out.println("Operation done successfully");
//}


/*---------------------------------------------------------------------------------------------------*/

//    public static void ConnectionDB(){
//        Connection conn = null;
//        Statement stmt = null;
//        try {
//            String url = "jdbc:sqlite:dish.db";
//            conn = DriverManager.getConnection(url);
//            conn.setAutoCommit(false);
//
//            //data = FXCollections.observableArrayList();
//
//            try {
//                String sql = "SELECT dish_name, dish_price, dish_description, dish_picture";
//                stmt = conn.createStatement();
//                ResultSet rs = stmt.executeQuery(sql);
//                while (rs.next()) {
//                    Dish newDish = new Dish();
//
//                    newDish.setDishName(rs.getString("dish_name"));
//                    newDish.setDishPrice(rs.getDouble("dish_price"));
//                    newDish.setDishDescription(rs.getString("dish_description"));
//
//                    String path = rs.getString("dish_picture");
//                    Image img = new Image(path);
//                    Image imageView = new ImageView();
//
//                    imageView.setPicture(img);
//                    imageView.setFitWidth(200);
//                    imageView.setFitHeight(200);
//                    newDish.setImage(imageView);
//
//                    data.add(newDish);
//                }
//                tableView.setItems(data);
//            } catch (Exception e) {
//                e.printStackTrace();
//                System.out.println("Error building data");
//            }
//        } catch (Exception e1) {
//            System.out.println(e1.getMessage());
//        } finally {
//            if (conn.isClosed() == false){
//                conn.close();
//            }
//        }
//    }