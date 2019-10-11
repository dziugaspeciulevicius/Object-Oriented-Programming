package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        primaryStage.setTitle("Welcome!");


        //WELCOME sign
        Text welcome = new Text();
        welcome.setText("WELCOME!");

        //New group button
        Button newGroupBtn = new Button("New group");
        
        //Choose group button
        Button chooseGroupBtn = new Button("Choose group");

        BorderPane layout = new BorderPane();
        layout.getChildren().addAll(welcome, newGroupBtn, chooseGroupBtn);
        primaryStage.setScene(new Scene(layout, 400, 300));
        //scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
