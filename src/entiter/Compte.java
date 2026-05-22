package entiter;

import java.util.Date;

public class Compte{

    private int id;
    private float solde;
    private Date dateCreation;
    private Date dateModification;

    // Constructeur
    public Compte(int id,
                  float solde,
                  Date dateCreation,
                  Date dateModification) {

        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
    }

    // Getter ID
    public int getId() {
        return id;
    }

    // Getter Solde
    public float getSolde() {
        return solde;
    }

    // Setter Solde
    public void setSolde(float solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {

        return "Compte [ID="
                + id
                + ", Solde="
                + solde
                + "]";
    }
}