package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Creates the initial purple window and defines what to do upon mouse click
 */
public class Purple {

    // Creates new instances of the classes "Red" and "Blue"
    Red red = new Red();
    Blue blue = new Blue();

    /**
     * Defines how to create the initial purple window
     * Elements include ComboBox and Button
     *
     * @param stage is the primary stage from the main class
     */
    public void setup(Stage stage) {

        ComboBox<String> colorChoice = new ComboBox<>();
        colorChoice.getItems().add("red");
        colorChoice.getItems().add("blue");

        Button select = new Button("Select");

        VBox root = new VBox(15);
        root.getChildren().addAll(colorChoice, select);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: transparent");
        Scene scene = new Scene(root);
        scene.setFill(Color.MEDIUMPURPLE);
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(250);
        stage.show();

        // Defines which color window to launch upon mouse click of "Select" button
        select.setOnAction(event -> {
            if (colorChoice.getValue() == null) {
                System.out.println("Please select a value before you submit");
            } else if (colorChoice.getValue().equals("red")) {
                red.launchRedWindow();
            } else if (colorChoice.getValue().equals("blue")) {
                blue.launchBlueWindow();
            }
        });
    }
}
