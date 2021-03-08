package sla.edu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FirstJavaFX extends Application {
    // Fields for all of the UIElements
    Label someText;
    Label moreText;
    Button myFirstButton;
    int numberOfClicks;
    ChoiceBox choiceBox;
    ImageView imageView;
    Image image;
    Image image2;
    Image image3;
    Image image4;
    Image image5;


    public FirstJavaFX() throws FileNotFoundException {
    }


    public static void main(String[] args) {
        // write your code here
        Application.launch(args);
    }

    public void start(Stage stage) throws FileNotFoundException {
        stage.setTitle("What's up CS!");

        //Create UI Elements
        //    myFirstButton = new Button("click on me plz!!!!");
        //    myFirstButton.setOnAction(actionEvent -> {
        //        userClickedTheButton();
        //   });
        choiceBox = new ChoiceBox();
        choiceBox.getItems().add("MoneyDude 1");
        choiceBox.getItems().add("MoneyDude 2");
        choiceBox.getItems().add("MoneyDude 3");
        choiceBox.getItems().add("MoneyDude 4");
        choiceBox.getItems().add("MoneyDude 5");
        choiceBox.setOnAction(actionEvent -> {
            userChoseInChoiceBox();
        });

        someText = new Label("yo really");
        moreText = new Label("he's still talking?");

        FileInputStream input = new FileInputStream("/Users/tashonzeigler/downloads/moneydude.jpeg");
         image = new Image(input);

        FileInputStream input2 = new FileInputStream("/Users/tashonzeigler/downloads/moneydude2.jpeg");
        image2 = new Image(input2);

        FileInputStream input3 = new FileInputStream("/Users/tashonzeigler/downloads/moneydude3.jpeg");
        image3 = new Image(input3);

        FileInputStream input4 = new FileInputStream("/Users/tashonzeigler/downloads/moneydude4.jpeg");
        image4 = new Image(input4);

        FileInputStream input5 = new FileInputStream("/Users/tashonzeigler/downloads/moneydude5.jpeg");
        image5 = new Image(input5);

        imageView = new ImageView(image);


        // 2. create Layout
        VBox myLayout = new VBox(someText, moreText, imageView, choiceBox);


        // 3. create Scene
        Scene myScene = new Scene(myLayout);
        stage.setScene(myScene);

        // 4. Display scene
        stage.setWidth(400);
        stage.setHeight(400);
        stage.show();


    }

    public void userClickedTheButton() {
        numberOfClicks = numberOfClicks + 1;
        moreText.setText("he's finally done yo! " + numberOfClicks);

    }

    public void userChoseInChoiceBox() {
        Object chosen = choiceBox.getValue();

        if (chosen.toString().contentEquals("MoneyDude 1")) {

            imageView.setImage(image);
        }
        chosen = choiceBox.getValue();

        if (chosen.toString().contentEquals("MoneyDude 2")) {

            imageView.setImage(image2);
        }

            chosen = choiceBox.getValue();

        if (chosen.toString().contentEquals("MoneyDude 3")) {

            imageView.setImage(image3);

        }
        chosen = choiceBox.getValue();

        if (chosen.toString().contentEquals("MoneyDude 4")) {

            imageView.setImage(image4);
        }
        chosen = choiceBox.getValue();

        if (chosen.toString().contentEquals("MoneyDude 5")) {

            imageView.setImage(image5);
        }
    }
}