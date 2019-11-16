package sample;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

public class Driver {

    public static void main(String[] args){
        createTable();
        insert();
    }

    private static Connection connection(String database){
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC"); //calling JDBC class to connect
            conn = DriverManager.getConnection("jdbc:sqlite:"+database+".db");
        } catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }

    private static void createTable(){
        Connection conn = connection("dish");
        Statement stmt;
        try {
            stmt = conn.createStatement();
            String sql =
                    "CREATE TABLE dish" +
                    "(dish_name VARCHAR(15) PRIMARY KEY NOT NULL, " +
                    "dish_price DOUBLE NOT NULL, " +
                    "dish_description VARCHAR(255) NOT NULL, " + //VARCHAR can max 255, TEXT a lot more
                    "dish_picture BLOB NOT NULL)";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }

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







    /*
    public static Driver Connector(){
        try {
            Class.forName("org.sqlite.JDBC"); //calling JDBC class to connect
            Driver conn = (Driver) DriverManager.getConnection("jdbc:sqlite:dish.db"); //connecting to existing db
            return conn;
        } catch (Exception e){
            return null;
        }
    }*/
}
