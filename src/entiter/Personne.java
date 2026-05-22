package entiter;

import java.util.Date;

public class Personne {

    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    private String phone;

    public Personne(
            int id,
            String nom,
            String prenom,
            int age,
            String adresse,
            String phone,
            Date d1,
            Date d2,
            Date d3,
            Date d4,
            Date d5
    ) {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Personne [id=" + id +
                ", nom=" + nom +
                ", prenom=" + prenom +
                ", age=" + age + "]";
    }
}