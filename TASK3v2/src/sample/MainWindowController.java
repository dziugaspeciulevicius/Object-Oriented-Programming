package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainWindowController {

    @FXML
    private Button exitButton;
    @FXML
    private Button addGroupButton;
    @FXML
    private Button seeGroupsButton;

    @FXML
    void addGroupAction(ActionEvent event) {
        try {
            Parent addGroupWindow = FXMLLoader.load(getClass().getResource("AddGroupWindow.fxml"));
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("Add Group");
            window.setScene(new Scene(addGroupWindow));
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

    @FXML
    void seeGroupsAction(ActionEvent event) {
        try {
            Parent groupMenuWindow = FXMLLoader.load(getClass().getResource("GroupMenuWindow.fxml"));
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("Group Menu");
            window.setScene(new Scene(groupMenuWindow));
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

    @FXML
    void exitButtonAction(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}
