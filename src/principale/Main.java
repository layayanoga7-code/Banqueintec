package principale;

import entiter.*;
import view.PersonneFrom;

import javax.swing.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Lancement de l'interface graphique
        SwingUtilities.invokeLater(() -> {
            new PersonneFrom().setVisible(true);
        });

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // =========================
        // Comptes
        // =========================

        Compte CP2 = new Compte(15, 75, new Date(), new Date());
        Compte CP3 = new Compte(12, 45, new Date(), new Date());
        Compte CP4 = new Compte(16, 15, new Date(), new Date());
        Compte CP5 = new Compte(18, 95, new Date(), new Date());
        Compte CP6 = new Compte(12, 25, new Date(), new Date());

        System.out.println(CP2);
        System.out.println(CP3);
        System.out.println(CP4);
        System.out.println(CP5);
        System.out.println(CP6);

        // =========================
        // Comptes Epargne
        // =========================

        compteEpargne CPE2 = new compteEpargne(145);
        compteEpargne CPE3 = new compteEpargne(25);
        compteEpargne CPE4 = new compteEpargne(45);
        compteEpargne CPE5 = new compteEpargne(24);

        System.out.println(CPE2);
        System.out.println(CPE3);
        System.out.println(CPE4);
        System.out.println(CPE5);

        // =========================
        // Comptes Payants
        // =========================

        ComptePayant CPP2 = new ComptePayant(120, 152);
        ComptePayant CPP3 = new ComptePayant(121, 153);
        ComptePayant CPP4 = new ComptePayant(122, 154);
        ComptePayant CPP5 = new ComptePayant(123, 155);
        ComptePayant CPP6 = new ComptePayant(124, 156);

        System.out.println(CPP2);
        System.out.println(CPP3);
        System.out.println(CPP4);
        System.out.println(CPP5);
        System.out.println(CPP6);

        // =========================
        // Comptes Simples
        // =========================

        CompteSimple CPS2 = new CompteSimple(400);
        CompteSimple CPS3 = new CompteSimple(405);
        CompteSimple CPS4 = new CompteSimple(407);
        CompteSimple CPS5 = new CompteSimple(4005);
        CompteSimple CPS6 = new CompteSimple(409);

        System.out.println(CPS2);
        System.out.println(CPS3);
        System.out.println(CPS4);
        System.out.println(CPS5);
        System.out.println(CPS6);

        // ======================= ==
        // Personnes
        // =========================

        Personne p1 = new Personne(
                1, "Kane", "Boureima", 18,
                 "Kalaban", "82821463",
                new Date(), new Date(), new Date(),
                new Date(), new Date()
        );

        Personne p2 = new Personne(
                2, "Toure", "Amadi", 22,
                "Kati", "76821463",
                new Date(), new Date(), new Date(),
                new Date(), new Date()
        );

        Personne p3 = new Personne(
                3, "Diarra", "Issa", 14,
                "Segou", "85821463",
                new Date(), new Date(), new Date(),
                new Date(), new Date()
        );

        Personne p4 = new Personne(
                4, "Kamaté", "Baba", 18,
                "Kidal", "685821463",
                new Date(), new Date(), new Date(),
                new Date(), new Date()
        );

        Personne p5 = new Personne(
                5, "Coulibaly", "Aboubacar", 25,
                "Niamakorocourani", "58521463",
                new Date(), new Date(), new Date(),
                new Date(), new Date()
        );

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}