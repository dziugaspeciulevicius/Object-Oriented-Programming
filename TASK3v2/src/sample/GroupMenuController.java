package sample;

import java.net.URL;
import java.util.ResourceBundle;

import Classes.Group;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class GroupMenuController {

    @FXML
    private TableView<Group> groupTable;
    @FXML
    private TableColumn<Group, String> groupColumn;
    @FXML
    private Button seeSelectedGroupButton;
    @FXML
    private Button addGroupButton;
    @FXML
    private Button closeButton;
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;

    ObservableList<Group> groupList = FXCollections.observableArrayList();


    @FXML
    void addGroupAction(ActionEvent event) {

    }

    @FXML
    void seeSelectedGroupAction(ActionEvent event) {

    }

    @FXML
    void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
