package entiter;

import java.util.Date;

public class CompteSimple extends Compte{

    // Constructeur
    public CompteSimple(float solde) {

        // Appel du constructeur parent
        super(
                1,              // id
                solde,          // solde
                new Date(),     // dateCreation
                new Date()      // dateModification
        );
    }

    // Méthode toString
    @Override
    public String toString() {

        return "CompteSimple [ID: "
                + this.getId()
                + ", Solde: "
                + this.getSolde()
                + "]";
    }
}