package model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Alert;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class GuichetAutomatique {


    /**
     * Creation d'une variable comptesList, qui va contenir une list de comptes non doublon
     */
    private HashSet<Comptes> comptesList;



    /**
     * Le numéro de compte du compte bancaire.
     */
    private final SimpleIntegerProperty numeroCompte = new SimpleIntegerProperty();
    /**
     * Le montant du dépôt effectué sur ce compte bancaire.
     */
    private final SimpleDoubleProperty mtnDepot = new SimpleDoubleProperty();
    /**
     * Le montant du retrait effectué sur ce compte bancaire.
     */
    private final SimpleDoubleProperty mtnRetrait = new SimpleDoubleProperty();

    /**
     * Dans le constructeur de GuichetAutomatique, je cree les comptes
     */
    public GuichetAutomatique() {
        comptesList = new HashSet<>();
        comptesList.add(new Comptes(1));
        comptesList.add(new Comptes(2));
    }


    public int getNumeroCompte() {
        return numeroCompte.get();
    }

    public SimpleIntegerProperty numeroCompteProperty() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte.set(numeroCompte);
    }

    public double getMtnDepot() {
        return mtnDepot.get();
    }

    public SimpleDoubleProperty mtnDepotProperty() {
        return mtnDepot;
    }

    public void setMtnDepot(double mtnDepot) {
        this.mtnDepot.set(mtnDepot);
    }

    public double getMtnRetrait() {
        return mtnRetrait.get();
    }

    public SimpleDoubleProperty mtnRetraitProperty() {
        return mtnRetrait;
    }

    public void setMtnRetrait(double mtnRetrait) {
        this.mtnRetrait.set(mtnRetrait);
    }

    public HashSet<Comptes> getComptesList() {
        return comptesList;
    }


    public void setComptesList(HashSet<Comptes> comptesList) {
        this.comptesList = comptesList;
    }

    /**
     * Methode permet de deposer de l'argent dans le compte
     * @param numeroCompte
     */


    public void deposerArgent(int numeroCompte){

        Comptes comptes = trouverCompte(numeroCompte);
        if (comptes != null){
            comptes.deposer(mtnDepot.get());
            System.out.println("Depot reussi");
            System.out.println("Nouveau solde: " + comptes.getSolde());
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Depot Reussi");
            alert.setHeaderText("Depot");
            alert.setContentText("Nouveau solde : " + comptes.getSolde());
            alert.showAndWait();
        }

    }


    /**
     * Methode permet de retirer de l'argent dans le compte
     * @param numeroCompte
     */

    public void retirerArgent(int numeroCompte){
        Comptes comptes = trouverCompte(numeroCompte);
        if (comptes != null){
            comptes.retirer(mtnRetrait.get());

            System.out.println("Retrait reussi");
            System.out.println("Nouveau solde : " + comptes.getSolde());
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Retrait effectue");
            alert.setHeaderText("Retrait");
            alert.setContentText("Nouveau solde : " + comptes.getSolde());
            alert.showAndWait();
        }


    }


    /**
     * methode permet de trouver un compte dans une liste de compte
     *
     * @param numeroCompte
     * @return compte
     */

    private Comptes trouverCompte(int numeroCompte) {
        for(Comptes compte : comptesList){
            if(compte.getNumCompte() == numeroCompte){
                return compte;
            }
        }
        return null;
    }


    /**
     * Methode qui permet d'afficher une boite de dialogue avec un message d'aide
     * @return message
     */
    public String obtenirDeLAide() {
        String message= "";
        message = "Numéro de téléphone du support : 418 000 0000";
        return message;
    }




}
