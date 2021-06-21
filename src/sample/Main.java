package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    Purple purple = new Purple();

    @Override
    public void start(Stage primaryStage) {
        purple.setup(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
