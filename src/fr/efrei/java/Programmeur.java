package fr.efrei.java;

public class Programmeur {
    String prenom;
    String nom;
    String langagePrefere;
    double salaire;

    public Programmeur(
            String prenom,
            String nom,
            String langagePrefere,
            double salaire) {
        this.prenom = prenom;
        this.nom = nom;
        this.langagePrefere = langagePrefere;
        this.salaire = salaire;

    }

    public void afficherFiche() {
        System.out.println(prenom + " " + nom);
        System.out.println("Langage préféré : " + langagePrefere);
        System.out.println("Salaire : " + salaire + " €");
    }


        public void augmenterSalaire(double pourcentage) {
        salaire = salaire * (1 + pourcentage / 100);
    }
}
