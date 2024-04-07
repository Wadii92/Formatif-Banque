package model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class GuichetAutomatique {


    /**
     * Creation d'une variable comptesList, qui va contenir une list de comptes non doublon
     */
    HashSet<Comptes> comptesList;

    private final SimpleIntegerProperty numeroCompte = new SimpleIntegerProperty();
    private final SimpleDoubleProperty mtnDepot = new SimpleDoubleProperty();
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
     * Methode qui permet d'afficher une boite de dialogue avec un message d'aide
     * @return message
     */
    public String obtenirDeLAide() {
        String message= "";

        message = "Numéro de téléphone : 418 000 0000";

        return message;
    }




}
