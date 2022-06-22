package io.github.singlerr.esquisse;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class Demo extends Application {
    private  JFXPanel javafxPanel;


    public void initAndShowGUI() {
        JFrame frame = new JFrame("Swing application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JavaFX panel.
        javafxPanel = new JFXPanel();
        frame.getContentPane().add(javafxPanel, BorderLayout.CENTER);

        // Create JavaFX scene.
        Application.launch (Demo.class, null);

        // Show frame.
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void start (Stage mainStage) {
        // Add scene to panel
        javafxPanel.setScene(createScene());
    }

    private Scene createScene() {
        Text text = new Text("Hello World");
        text.setEffect(new Reflection());

        BorderPane pane = new BorderPane();
        pane.setCenter(text);
        Scene scene = new Scene(pane);

        return scene;
    }
}