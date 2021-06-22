package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Red {

    public void launchExercise() {
        Label lbl = new Label("Red Window");
        HBox root = new HBox();
        root.getChildren().add(lbl);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: transparent");
        Scene sc = new Scene(root);
        sc.setFill(Color.RED);
        Stage stage2 = new Stage();
        stage2.setScene(sc);
        stage2.setWidth(400);
        stage2.setHeight(250);
        stage2.show();
    }
}
