package at.ac.fhcampuswien;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NewsController {

    //needed: 4 BUTTONS
    // ELEMENT for "get top headlines austria || ELEMENT for "get all news btc" || LABEL or smth for display Count Articles || QUIT Program - maybe also button and Alert -> "quitting text"

    @FXML
    private Label label2;

    public void initialize() {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        label2.setText("Hello World!");
    }

}