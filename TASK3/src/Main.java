import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        Parent welcomeWindow = FXMLLoader.load(getClass().getResource("FrontEnd/WelcomeSample.fxml"));
        window.setTitle("Academic data");

        window.setScene(new Scene(welcomeWindow, 600, 420));
        window.setResizable(false);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
