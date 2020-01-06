package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class LogInController implements Initializable {


    @FXML private PasswordField login_password;
    @FXML private TextField login_username;

    @FXML
    void login(ActionEvent event) throws SQLException, IOException {

        String username, password;
        username =  login_username.getText();
        password = login_password.getText();

        Connection connection = DbConnect.getInstance().getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet =  statement.executeQuery("SELECT * FROM users WHERE username" +
                " = '" + username + "' OR email = '" + login_password + "' AND password = '" + password + "'");

        if (resultSet.next()) {
            //try {
                Parent appWindow = FXMLLoader.load(getClass().getResource("clientApp.fxml"));
                Stage window = new Stage();
                //Node node = (Node) event.getSource();
                //Stage stage = (Stage) node.getScene().getWindow();
                window.initModality(Modality.APPLICATION_MODAL);
                window.setScene(new Scene(appWindow));
                window.setResizable(true);
                window.show();
            //} catch (Exception e) {
            //    System.out.println(e);
            //    Alert alert = new Alert(Alert.AlertType.ERROR);
            //    alert.setTitle("Error");
            //    alert.setHeaderText("CAN'T LOAD A WINDOW");
            //    alert.setContentText("Window you are trying to open cannot be reached at the moment!");
            //    alert.showAndWait();
            //}
        }

    }

    @FXML
    private void signup() throws IOException {
        try {
            Parent signupWindow = FXMLLoader.load(getClass().getResource("signup.fxml"));
            Stage window = new Stage();
            //Node node = (Node) event.getSource();
            window.initModality(Modality.APPLICATION_MODAL);
            //Stage stage = (Stage) node.getScene().getWindow();
            window.setScene(new Scene(signupWindow));
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
    public void initialize(URL location, ResourceBundle resources) {

    }
}