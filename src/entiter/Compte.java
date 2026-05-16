package entiter;
import java.util.Date;
public class Compte {
    private int code;
    private float solde;
    private int nbCompte;
    private Date createdDate;
    private Date updated;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public int getNbCompte() {
        return nbCompte;
    }

    public void setNbCompte(int nbCompte) {
        this.nbCompte = nbCompte;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Compte(int code, float solde, int nbCompte, Date createdDate, Date updated) {
        this.code = code;
        this.solde = solde;
        this.nbCompte = nbCompte;
        this.createdDate = createdDate;
        this.updated = updated;
    }
}