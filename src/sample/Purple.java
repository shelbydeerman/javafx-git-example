package sample;

import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Purple {

    public void setup(Stage stage) {
        HBox root = new HBox();
        Scene scene = new Scene(root);
        scene.setFill(Color.MEDIUMPURPLE);
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(250);
        stage.show();
    }

}
