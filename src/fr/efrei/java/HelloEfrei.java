package fr.efrei.java;

import java.util.Scanner;

public class HelloEfrei {

    public static void main(String[] args) {

//        String prenomAlice = "Alice";
//        String nomAlice = "Martin";
//        String langageAlice = "Java";
//        double salaireAlice = 42000;
//
//        System.out.println(prenomAlice + " " + nomAlice);
//        System.out.println("Langage préféré : " + langageAlice);
//        System.out.println("Salaire : " + salaireAlice + " €");
//
//        String prenomAlex = "Alex";
//        String nomAlex = "Dupont";
//        String langageAlex = "Python";
//        double salaireAlex = 45000;
//
//        System.out.println();
//        System.out.println(prenomAlex + " " + nomAlex);
//        System.out.println("Langage préféré : " + langageAlex);
//        System.out.println("Salaire : " + salaireAlex + " €");

//        ***********************************************************************
//        Programmeur alice =
//                new Programmeur("Alice", "Martin", "Java", 42000);
//
//        Programmeur alex =
//                new Programmeur("Alex", "Dupont", "Python", 45000);
//
//        alice.afficherFiche();
//
//        System.out.println();
//
//        alex.afficherFiche();

//        ***********************************************************************

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Prénom : ");
//        String prenom = scanner.nextLine();
//
//        System.out.print("Nom : ");
//        String nom = scanner.nextLine();
//
//        System.out.print("Langage préféré : ");
//        String langage = scanner.nextLine();
//
//        System.out.print("Salaire : ");
//        double salaire = scanner.nextDouble();
//
//        Programmeur programmeur =
//                new Programmeur(prenom, nom, langage, salaire);
//
//        programmeur.afficherFiche();
//
//        scanner.close();

//        ***********************************************************************

        Scanner scanner = new Scanner(System.in);
        Programmeur alice = new Programmeur("Alice","Martin","Java",42000);

        alice.augmenterSalaire(5);

        Programmeur alex = new Programmeur("Alex", "Dupont", "Python", 45000);

        int choix = -1;
        while (choix != 0) {
            afficherMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("Veuillez saisir un nombre.");
                scanner.nextLine();
                continue;
            }

            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> alice.afficherFiche(); // 1 seule instruction => pas { }
                case 2 -> alex.afficherFiche();
                case 3 -> {
                    Programmeur programmeur = saisirProgrammeur(scanner);
                    programmeur.afficherFiche();
                }
                case 0 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix invalide.");
            }
        }
        scanner.close();
    }

    public static void afficherMenu() {
        System.out.println();
        System.out.println("==============================");
        System.out.println(" Gestion des programmeurs");
        System.out.println("==============================");
        System.out.println("1 - Afficher Alice");
        System.out.println("2 - Afficher Alex");
        System.out.println("3 - Ajouter un programmeur");
        System.out.println("0 - Quitter");
        System.out.print("Votre choix : ");
    }

    public static Programmeur saisirProgrammeur(Scanner scanner) {
        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Nom : ");
        String nom = scanner.nextLine();

        System.out.print("Langage préféré : ");
        String langage = scanner.nextLine();

        double salaire;
        while (true) {
            System.out.print("Salaire : ");
            if (scanner.hasNextDouble()) {
                salaire = scanner.nextDouble();
                scanner.nextLine();

                if (salaire >= 0) {
                    break;
                }

                System.out.println("Le salaire ne peut pas être négatif.");
            } else {
                System.out.println("Veuillez saisir un nombre.");
                scanner.nextLine();
            }
        }

        return new Programmeur(prenom, nom, langage, salaire);
    }
}
