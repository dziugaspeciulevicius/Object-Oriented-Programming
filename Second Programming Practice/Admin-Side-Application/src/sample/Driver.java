package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {

    public static void getConnection() {
        String connect_string = "jdbc:sqlite:D:\\MY FILES\\Studies\\3 SEMESTER\\Object-Oriented-Programming\\Second Programming Practice\\data.db";
        Connection connection = null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(connect_string);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
