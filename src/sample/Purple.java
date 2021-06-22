package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Purple {

    Red red = new Red();
    Blue blue = new Blue();

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
