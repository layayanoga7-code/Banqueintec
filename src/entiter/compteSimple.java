package entiter;
import java.util.Date;
public class compteSimple extends Compte {
    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }

    private float decouvert;

    public compteSimple(int code, float solde, int nbCompte, Date createdDate, Date updated, float decouvert) {
        super(code, solde, nbCompte, createdDate, updated);
        this.decouvert = decouvert;
    }
}
