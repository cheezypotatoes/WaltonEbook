package org.openjfx.program.controller;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.openjfx.program.app;
import org.openjfx.program.model.BookData;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import static javafx.animation.Interpolator.EASE_IN;


public class mainPageController implements Initializable {

    @FXML
    private VBox popup__myBooks;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        popup__myBooks.setMouseTransparent(false);
    }

    @FXML
    private void dropAnimation(){

        TranslateTransition translateAnimation = new TranslateTransition(Duration.millis(400),popup__myBooks);
        FadeTransition fadeInAnimation = new FadeTransition(Duration.millis(400),popup__myBooks);
        fadeInAnimation.setFromValue(0);
        fadeInAnimation.setToValue(1);
        fadeInAnimation.setInterpolator(EASE_IN);
        translateAnimation.setFromY(-100f);
        translateAnimation.setToY(0f);
        translateAnimation.setInterpolator(EASE_IN);


        translateAnimation.setOnFinished(actionEvent -> {
            popup__myBooks.setMouseTransparent(false);
        });

        translateAnimation.play();
        fadeInAnimation.play();
        popup__myBooks.setMouseTransparent(true);

    }

    @FXML
    private void returnAnimation(){
        TranslateTransition translateAnimation = new TranslateTransition(Duration.millis(300),popup__myBooks);
        FadeTransition fadeInAnimation = new FadeTransition(Duration.millis(300),popup__myBooks);
        fadeInAnimation.setFromValue(1);
        fadeInAnimation.setToValue(0);
        fadeInAnimation.setInterpolator(EASE_IN);
        translateAnimation.setFromY(0);
        translateAnimation.setToY(-100f);
        translateAnimation.setInterpolator(EASE_IN);


        translateAnimation.setOnFinished(actionEvent -> {
            popup__myBooks.setVisible(false);
        });

        translateAnimation.play();
        fadeInAnimation.play();
        popup__myBooks.setMouseTransparent(true);
    }

}