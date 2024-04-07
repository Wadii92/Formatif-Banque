package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import model.GuichetAutomatique;

/**
 * Graphical controls and command line controls offering a choice of ticket vending machines.
 */
public class GuichetAutomatiqueController extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Guichet Automatique");

        GuichetAutomatique guichetAutomatique1 = new GuichetAutomatique();
        TabPane root = new TabPane();

        Tab tabOfMachine1 = new Tab();
        tabOfMachine1.setText("Guichet 1");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/GuichetAutomatique.fxml"));
        GuichetAutomatiqueGraphicalController guichetautomatique1GraphicalController = new GuichetAutomatiqueGraphicalController(guichetAutomatique1);
        fxmlLoader.setController(guichetautomatique1GraphicalController);


        tabOfMachine1.setContent(fxmlLoader.load());
        root.getTabs().add(tabOfMachine1);




        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
