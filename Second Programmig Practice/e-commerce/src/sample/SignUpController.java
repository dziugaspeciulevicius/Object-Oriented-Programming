package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML private TextField signup_email;
    @FXML private TextField signup_username;
    @FXML private PasswordField signup_password;

    @FXML
    void signup(ActionEvent event) {
        Connection connection = DbConnect.getInstance().getConnection();

        if (signup_username.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Username field is empty");
            alert.setContentText("Please fill username field and try again!");
            alert.showAndWait();
            return;
        }

        if (signup_email.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Email field is empty");
            alert.setContentText("Please fill email field and try again!");
            alert.showAndWait();
            return;
        }
        if (signup_password.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Password field is empty");
            alert.setContentText("Please fill password field and try again!");
            alert.showAndWait();
            return;
        }

        try {
            String username = signup_username.getText();
            String email = signup_email.getText();
            String password = signup_password.getText();

            Statement statement = connection.createStatement();
            int status = statement.executeUpdate("insert into users (username, email, password) " +
                    "values ( ' "+username+ "','"+email+"','"+password+"')");

            if (status > 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Registration successful!");
                alert.setHeaderText(null);
                alert.setContentText("You have registered successfully and can now login into your account!");
                alert.showAndWait();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void login() throws IOException {
        try {
            Parent loginWindow = FXMLLoader.load(getClass().getResource("login.fxml"));
            Stage window = new Stage();
            //Node node = (Node) event.getSource();
            //Stage stage = (Stage) node.getScene().getWindow();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setScene(new Scene(loginWindow));
            window.setResizable(true);
            window.show();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("CAN'T LOAD A WINDOW");
            alert.setContentText("Window you are trying to open cannot be reached at the moment!");
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}