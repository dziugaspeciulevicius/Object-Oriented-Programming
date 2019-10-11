package FrontEnd.Welcome;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class WelcomeController {

    private AnchorPane rootPane;

    @FXML
    private Button chooseGroupButton;
    @FXML
    private Button newGroupButton;
    @FXML
    private Button exitButton;

    @FXML
    private void newGroupAction() {
        try {
            Parent addGroupWindow = FXMLLoader.load(getClass().getResource("AddGroup/AddGroup.fxml"));
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Add Group");
            stage.setScene(new Scene(addGroupWindow));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
    }

    @FXML
    private void chooseGroupAction() {
        try {
            Parent chooseGroupWindow = FXMLLoader.load(getClass().getResource("ChooseGroup/ChooseGroup.fxml"));
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Choose Group");
            stage.setScene(new Scene(chooseGroupWindow));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load the window");
        }
    }

    @FXML
    private void exitButtonAction() {
        // get a handle to the stage
        Stage stage = (Stage) exitButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
