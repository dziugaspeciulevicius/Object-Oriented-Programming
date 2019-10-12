package FrontEnd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private Button chooseGroupButton;
    @FXML
    private Button newGroupButton;
    @FXML
    private Button exitButton;

    @FXML
    private void newGroupAction(){
        try {
            Parent addGroupWindow = FXMLLoader.load(getClass().getResource("AddGroup.fxml"));
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("Add Group");
            window.setScene(new Scene(addGroupWindow));
            window.setResizable(false);
            window.show();
        } catch (Exception e) {
            System.out.println("Can't load New Group window");
        }
    }

    @FXML
    private void chooseGroupAction() {
        try {
            Parent chooseGroupWindow = FXMLLoader.load(getClass().getResource("ChooseGroup.fxml"));
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("Choose Group");
            window.setScene(new Scene(chooseGroupWindow));
            window.setResizable(false);
            window.show();
        } catch (Exception e) {
            System.out.println("Can't load Choose Group window");
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
