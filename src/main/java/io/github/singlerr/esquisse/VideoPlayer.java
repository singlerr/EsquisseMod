package io.github.singlerr.esquisse;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;

public class VideoPlayer extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Platform.setImplicitExit(false);

        JOptionPane.showMessageDialog(null,"asd","asdf",JOptionPane.INFORMATION_MESSAGE);
        JFXPanel panel = new JFXPanel();

        Media m = new Media(new File("C:\\Users\\Singlerr\\Documents\\oCam\\1.mp4").toURI().toString());
        MediaPlayer player = new MediaPlayer(m);
        MediaView viewer = new MediaView(player);
        viewer.setMediaPlayer(player);
        Group root = new Group();
        Scene scene = new Scene(root,600,600);
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
        root.getChildren().add(viewer);
        //player.play();
        primaryStage.setScene(scene);
        primaryStage.show();
        player.play();
    }
    public void launchApp(){
        launch();
    }
}
