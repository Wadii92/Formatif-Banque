package controller;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.GuichetAutomatique;

/**
 * Graphical controls of a transit ticket vending machine offering to change transit route.
 */
public class GuichetAutomatiqueGraphicalController {
    private final GuichetAutomatique guichetAutomatique;
    @FXML
    private TextField mtnDepot;
    @FXML
    private TextField numeroCompte;
    @FXML
    private TextField mtnRetrait;
    @FXML
    private Button btnRetirer;
    @FXML
    private Button btnDeposer;
    @FXML
    private Button obtAide;


    @FXML
    private void initialize() {
        obtAide.setOnAction(this::onInfoButtonClick);
    }

    public GuichetAutomatiqueGraphicalController(GuichetAutomatique guichetAutomatique) {
        this.guichetAutomatique = guichetAutomatique;
    }


    private void onDeposerButtonClick(ActionEvent event){


    }

    private void onRetirerButtonClick(ActionEvent event){


    }

    private void onInfoButtonClick(ActionEvent actionEvent) {
        String info = guichetAutomatique.obtenirDeLAide();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText(info);
        alert.showAndWait();
    }

}
