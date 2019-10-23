package sample;

import java.net.URL;
import java.util.ResourceBundle;

import Classes.Group;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GroupMenuController {
    @FXML
    private TableColumn<String, Group> groupColumn;
    @FXML
    private TableView<Group> groupTable;
    @FXML
    private TextField groupNameInput;
    @FXML
    private Button addGroupButton;
    @FXML
    private Button seeSelectedGroupButton;
    @FXML
    private Button closeButton;
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;

    ObservableList<Group> groupList = FXCollections.observableArrayList();

    //private void setStudentTableController(FXMLLoader loader){
    //    studentTableController = loader.getController();
    //}


    @FXML
    void seeSelectedGroupAction(ActionEvent event) {

    }

    AddGroupController addGroupController;
    //method to set addGroupController
    private void setAddGroupController(FXMLLoader loader){
        addGroupController = loader.getController();
    }
    @FXML
    void openAddGroupAction(ActionEvent event) {
        try {
            //Parent root = FXMLLoader.load(getClass().getResource("AddGroupWindow.fxml"));
            //So basically if I want to show inputted info in a label, I need to redo fxml loader like this below
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddGroupWindow.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);

            Group group = new Group();
            group.setGroupName(groupNameInput.getText());
            groupList.add(group);
            groupTable.getItems().add(group);
            setAddGroupController(fxmlLoader);
            addGroupController.setGroupName(group);

            window.setTitle("Add Group");
            window.setScene(new Scene(root));
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
    void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
