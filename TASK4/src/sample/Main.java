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

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MenuWindow.fxml"));
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);

        Connection conn = null;
        try {
            String url = "jdbc:sqlite:dish.db";
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
                    String sql = "SELECT * FROM Dish";
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







        //connection("dish.db");
    }
}







//------------------------------------------------------------------------------------------------
/*
    private static Connection connection(String dish) {
        Connection conn = null;
        try {
            String url = ("jdbc:sqlite:dish.db");
            conn = DriverManager.getConnection(url);
            //Class.forName("org.sqlite.JDBC");
            //conn = DriverManager.getConnection("jdbc:sqlite:dish.db");
            System.out.println("Connected!");
        } catch (Exception exc) {
        System.out.println(exc.getMessage());
            System.out.println("Failed to connect");
        }
        return conn;
    }
*/
//------------------------------------------------------------------------------------------------
    /*
    private static Connection connection(String dish) throws SQLException {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC"); //calling JDBC class to connect
            conn = DriverManager.getConnection("jdbc:sqlite:dish.db");
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            if (conn.isClosed() == false) {
                conn.close();
            }
            return conn;
        }
    */
//------------------------------------------------------------------------------------------------
/*
        private static void insert(){
        try {
            FileInputStream fis;    //fis - file input stream
            int num_rows = 0;       //see how many rows effected
            File image = new File("D:\\MY FILES\\Studies\\3 SEMESTER\\Object-Oriented-Programming\\TASK4\\src\\Images\\pizza.png");
            fis = new FileInputStream(image); //input stream
            ByteArrayOutputStream bos = new ByteArrayOutputStream(); //bos - byteArray output stream
            byte[] buf = new byte[1024]; //Byte
            for (int readNum; (readNum = fis.read(buf)) != -1;){
                bos.write(buf, 0, readNum); //now we have full bit array of info for the image
            }
            fis.close();
            Connection conn = connection("dish");
            String sql = ("INSERT INTO dish(dish_name, dish_price, dish_description, dish_picture) VALUES (?,?,?,?)");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Pizza"); //1st ? = dish name
            ps.setDouble(2, 10.99); //2nd ? = dish price
            ps.setString(3, "Savory dish of Italian origin, consisting of round, flattened base of leavened " +
                    "wheat-based dough topped with tomatoes, cheese, olives and some salami. Baked at " +
                    "a high temperature, traditionally in a wood-fired oven. "); //3rd ? = dish description
            ps.setBytes(4, bos.toByteArray()); //4th ? = byte Array / dish picture

            num_rows = ps.executeUpdate();         //we want to find out how many rows were affected by picture
            if(num_rows > 0) {
                System.out.println("Data has been inserted");
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
*/
//------------------------------------------------------------------------------------------------
    /*
        Connection conn = null;
        PreparedStatement ps = null;
        InputStream is = null;
        try {
            //Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:dish.db");
            System.out.println("Connection successful");
            //ps = conn.prepareCall("INSERT INTO dish VALUES(?,?,?,?)");
            ps = conn.prepareCall("INSERT INTO dish(dish_name, dish_price, dish_description, dish_picture) VALUES (?,?,?,?)");
            ps.setString(1, "Pizza"); //1st ? = dish name
            ps.setDouble(2, 10.99); //2nd ? = dish price
            ps.setString(3, "Savory dish of Italian origin, consisting of round, flattened base of leavened " +
                    "wheat-based dough topped with tomatoes, cheese, olives and some salami. Baked at " +
                    "a high temperature, traditionally in a wood-fired oven. "); //3rd ? = dish description
            is = new FileInputStream(new File("D:\\MY FILES\\Studies\\3 SEMESTER\\Object-Oriented-Programming\\TASK4\\src\\Images\\pizza.png"));
            ps.setBinaryStream(4, is);
        //} catch (ClassNotFoundException e) {
        //    e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(is != null) is.close();
                if(ps != null) ps.close();
                if(conn != null) conn.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }*/
//------------------------------------------------------------------------------------------------
/*
    private static void createTable(){
        Connection conn = connection("dish");
        Statement stmt;
        try {
            stmt = conn.createStatement();
            String sql =
                    "CREATE TABLE dish" +
                    "(dish_name VARCHAR(15) PRIMARY KEY NOT NULL," +
                    "dish_price DOUBLE NOT NULL," +
                    "dish_description VARCHAR(255) NOT NULL," + //VARCHAR can max 255, TEXT a lot more
                    "dish_picture BLOB NOT NULL)";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    */