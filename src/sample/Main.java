package sample;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Main class for JavaFx Git Exercise
 */
public class Main extends Application {

    // Creates a new instance of the class "Purple"
    Purple purple = new Purple();

    @Override
    public void start(Stage primaryStage) {
        // Creates the initial purple window
        purple.setup(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
