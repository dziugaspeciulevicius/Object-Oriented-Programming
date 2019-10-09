package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Combo box");
        button = new Button("Submit");

        listView = new ListView<>();
        listView.getItems().addAll("Iron Man", "Titanic", "Contact", "Surrogates");
        //selection model for selecting multiple items
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e -> buttonClicked());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView, button);

        window.setScene(new Scene(layout, 300, 250));
        window.show();
    }

    //print out selected movies
    private void buttonClicked(){
        //message in the terminal printed
        String message = "";
        //grab selected items, store inside observable list and print
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();

        for(String m:movies){
            message += m + "\n";
        }

        System.out.println(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
