package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Label;

/**
 * Creates the blue window when "blue" is selected from the ComboBox
 */
public class Blue {

    /**
     * Defines how to create the blue window
     * Only element is a label
     */
    public void launchBlueWindow() {
        Label lbl = new Label("Blue Window");
        HBox root = new HBox();
        root.getChildren().add(lbl);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: transparent");
        Scene scene = new Scene(root);
        scene.setFill(Color.BLUE);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(250);
        stage.show();
    }
}
