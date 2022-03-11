package at.ac.fhcampuswien;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


//needed: 4 BUTTONS
// ELEMENT for "get top headlines austria || ELEMENT for "get all news btc" || LABEL or smth for display Count Articles || QUIT Program - maybe also button and Alert -> "quitting text"
public class NewsController {
    Timer timer = new Timer();

    @FXML
    private Button exitButton;

    @FXML
    private Button btnGetToplinesAustria;

    @FXML
    private TableView<Article> tvNews;
    @FXML
    private TableColumn<Article, String> title;
    @FXML
    private TableColumn<Article, String> author;

    ObservableList<Article> list = FXCollections.observableArrayList(
            new Article("Daniel", "BTC"),
            new Article("Anna", "ETH"),
            new Article("xx", "Austria"),
            new Article("yy", "Germany"));


    @FXML
    public void exitApplication() {
        exitButton.setText("See you soon!");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    System.exit(0);
                });
            }
        }, 1000l);
    }

    /***
     * test list for testing, replacing with actual list when ready with filtering "austria"
     * @param event
     */
    @FXML
    void GetTopLinesAustria(ActionEvent event) {
        author.setCellValueFactory(new PropertyValueFactory<Article,String>("Title"));
        title.setCellValueFactory(new PropertyValueFactory<Article,String>("Author"));
        tvNews.setItems(list);
    }
    @FXML
    void GetTopLinesBitcoin(ActionEvent event) {

    }

}