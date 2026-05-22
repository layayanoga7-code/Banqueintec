package entiter;

import java.util.Date;

public class ComptePayant extends Compte {

    public ComptePayant(int id, float solde) {

        super(id, solde, new Date(), new Date());
    }

    public void verser(float montant) {

        if (montant > 0) {

            this.setSolde(this.getSolde() + montant);
        }
    }

    public void retirer(float montant) {

        if (montant > 0 && this.getSolde() >= montant) {

            this.setSolde(this.getSolde() - montant);
        }
    }

    @Override
    public String toString() {

        return "ComptePayant [ID="
                + this.getId()
                + ", Solde="
                + this.getSolde()
                + "]";
    }
}