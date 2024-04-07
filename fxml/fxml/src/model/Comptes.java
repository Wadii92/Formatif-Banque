package model;
/**
 * La classe Compte représente un compte bancaire avec un numéro de compte unique et un solde.
 */

public class Comptes {




    private double solde; // Le numéro de compte unique
    private int numCompte; // Le solde du compte


    /**
     * Constructeur de la classe Compte.
     * @param numCompte Le numéro de compte unique attribué au compte.
     */
    public Comptes(int numCompte) {
        this.numCompte = numCompte;
        this.solde = 0 ;
    }


    /**
     * Méthode pour obtenir le solde du compte.
     * @return Le solde actuel du compte.
     */
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Méthode pour obtenir le numéro de compte.
     * @return Le numéro de compte du compte.
     */
    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }


    /**
     * Methode qui prend en parametre un montant saisi par l'utilisateur et effectue le depot
     * @param montant Le montant à déposer sur le compte.
     */
    public void deposer(double montant){
        solde += montant;
        System.out.println("Dépôt de " + montant + " effectué avec succès. Nouveau solde : " + solde);

    }

    /**
     * Methode qui prend en parametre un montant saisi par l'utilisateur et effectue le retrait
     * @param montant Le montant à retirer du compte.
     */
    public void retirer(double montant){
        if (solde >= montant) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué avec succès. Nouveau solde : " + solde);
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }

    }


}
