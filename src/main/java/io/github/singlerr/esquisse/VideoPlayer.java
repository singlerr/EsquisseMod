package io.github.singlerr.esquisse;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class VideoPlayer extends Application {

    @Override
    public void start(Stage primaryStage) {
        Platform.setImplicitExit(false);
        new JFXPanel();
        Media media = new Media("");
        /*
        // center video position
        javafx.geometry.Rectangle2D screen = Screen.getPrimary().getVisualBounds();
        viewer.setX((screen.getWidth() - primaryStage.getWidth()) / 2);
        viewer.setY((screen.getHeight() - primaryStage.getHeight()) / 2);

        // resize video based on screen size
        DoubleProperty width = viewer.fitWidthProperty();
        DoubleProperty height = viewer.fitHeightProperty();
        width.bind(Bindings.selectDouble(viewer.sceneProperty(), "width"));
        height.bind(Bindings.selectDouble(viewer.sceneProperty(), "height"));
        viewer.setPreserveRatio(true);
         */
        // add video to stackpane
        primaryStage.show();
    }
    public void launchApp(){
        launch();
    }
}
