package entiter;
import java.util.Date;

public class ComptePayant extends Compte{
    private float verser;
    private float retirer;
    private String toString;

    public float getVerser() {
        return verser;
    }

    public void setVerser(float verser) {
        this.verser = verser;
    }

    public float getRetirer() {
        return retirer;
    }

    public void setRetirer(float retirer) {
        this.retirer = retirer;
    }

    public String getToString() {
        return toString;
    }

    public void setToString(String toString) {
        this.toString = toString;
    }

    public ComptePayant(int code, float solde, int nbCompte, Date createdDate, Date updated, float verser, float retirer, String toString) {
        super(code, solde, nbCompte, createdDate, updated);
        this.verser = verser;
        this.retirer = retirer;
        this.toString = toString;
    }
}

