package sample;

import Classes.Dish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

    public static void ConnectionDB(){
        Connection conn = null;
        Statement stmt = null;
        try {
            String url = "jdbc:sqlite:dish.db";
            conn = DriverManager.getConnection(url);

            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Dish;");

            while ( rs.next() ) {
                String dishName = rs.getString("dish_name");
                String dishDescription = rs.getString("dish_description");
                double dishPrice = rs.getInt("dish_price");
                String picture = rs.getString("dish_picture");

                Main.dishList.add(new Dish(dishName, dishDescription, dishPrice, picture));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}

//public static void main(String[] args) throws SQLException {
//    launch(args);
//    Connection conn = null;
//        try {
//                String url = "jdbc:sqlite:dish.db";
//                conn = DriverManager.getConnection(url);
//                System.out.println("\nConnected!");
//
//                while (true) {
//                System.out.println("\n1 - List the content");
//                System.out.println("2 - I'm done. Open the interface for me pls. Thank you. \n");
//                System.out.print("Enter menu item number: ");
//                Scanner scanner = new Scanner((System.in));
//                String item = scanner.nextLine();
//
//                if (item.equals("1")) {
//                //List<Dish> dishList;
//                String sql = "SELECT * FROM Dish";
//                Statement stmt  = conn.createStatement();
//                ResultSet rs    = stmt.executeQuery(sql);
//                while (rs.next()) {
//                //String current = rs.getString("1") + rs.getDouble(2) + rs.getString(3);
//                //dishList.add(current);
//                System.out.println("Name: " + rs.getString(1) +  "\nPrice: " + rs.getDouble(2) +
//                "\nDescription: " + rs.getString(3) + "\nPicture: " + rs.getString(4));
//                }
//                } else
//                  break;
//                }
//                }
//                catch (Exception exc) {
//                System.out.println(exc.getMessage());
//                }
//                finally {
//                if (conn.isClosed() == false) {
//                conn.close();
//                System.out.println("Connection closed");
//                }
//            }
//         }