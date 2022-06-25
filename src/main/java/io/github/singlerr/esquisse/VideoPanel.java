package io.github.singlerr.esquisse;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;

import javax.swing.*;
import java.awt.*;

public class VideoPanel extends JFrame {
    private MediaView view;
    private JFXPanel panel;
    private Scene scene;
    private StackPane stackPane;
    public VideoPanel() {
        super();
        panel = new JFXPanel();
        getContentPane().add(panel);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                stackPane = new StackPane();

                Media media = new Media("C:\\Users\\Singlerr\\Documents\\oCam\\1.mp4");
                MediaPlayer player = new MediaPlayer(media);

                view = new MediaView(player);

                Rectangle2D screen = Screen.getPrimary().getVisualBounds();
                view.setX((screen.getWidth() - panel.getWidth()) / 2);
                view.setY((screen.getHeight() - panel.getHeight()) / 2);

                // resize video based on screen size
                DoubleProperty width = view.fitWidthProperty();
                DoubleProperty height = view.fitHeightProperty();
                width.bind(Bindings.selectDouble(view.sceneProperty(), "width"));
                height.bind(Bindings.selectDouble(view.sceneProperty(), "height"));
                view.setPreserveRatio(true);

                // add video to stackpane
                stackPane.getChildren().add(view);

                scene = new Scene(stackPane);
                panel.setScene(scene);
            }
        });


        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setVisible(true);

        view.getMediaPlayer().play();
    }

    /*
    public void initialize() {
        JFrame videoPanel = new JFrame();
        //  JFXPanel panel = new JFXPanel();
        videoPanel.setLayout(new BorderLayout());
        //   videoPanel.add(panel);

        videoPanel.setExtendedState(JFrame.MAXIMIZED_BOTH);
        videoPanel.setUndecorated(true);
        videoPanel.setVisible(true);
    }

    private void init(JFXPanel panel) {
        Media media = new Media("C:\\Users\\Singlerr\\Documents\\oCam\\1.mp4");
        MediaPlayer player = new MediaPlayer(media);
        MediaView viewer = new MediaView(player);

        StackPane root = new StackPane();

        Rectangle2D screen = Screen.getPrimary().getVisualBounds();
        viewer.setX((screen.getWidth() - panel.getWidth()) / 2);
        viewer.setY((screen.getHeight() - panel.getHeight()) / 2);

        // resize video based on screen size
        DoubleProperty width = viewer.fitWidthProperty();
        DoubleProperty height = viewer.fitHeightProperty();
        width.bind(Bindings.selectDouble(viewer.sceneProperty(), "width"));
        height.bind(Bindings.selectDouble(viewer.sceneProperty(), "height"));
        viewer.setPreserveRatio(true);

        // add video to stackpane
        root.getChildren().add(viewer);
        Scene scene = new Scene(root);
        panel.setScene(scene);
    }

     */
}
