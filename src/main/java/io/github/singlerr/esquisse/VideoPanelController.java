package io.github.singlerr.esquisse;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URL;
import java.util.ResourceBundle;

public class VideoPanelController implements Initializable {

    private MediaPlayer player;

    @FXML
    private MediaView view;

    @FXML
    private StackPane pane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
