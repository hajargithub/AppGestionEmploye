import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Création de l'instance de la classe GestionEmployes
        GestionEmployes gestionEmployes = new GestionEmployes();
        // Ajouter trois employés statiques
        Employe employe1 = new Employe(1, "Ahmed Harkaoui", "Tech Lead", 8500);
        Employe employe2 = new Employe(2, "Haroune Harkaoui", "Manager", 7000);
        Employe employe3 = new Employe(3, "Marwa Fakhoury", "Designer", 6000);

        // Ajouter les employés au tableau
        gestionEmployes.ajouterEmploye(employe1);
        gestionEmployes.ajouterEmploye(employe2);
        gestionEmployes.ajouterEmploye(employe3);

        // Boucle pour afficher le menu en continu tant que l'utilisateur n'a pas choisi de quitter
        boolean running = true;
        while (running) {
            // Affichage des options du menu
            GestionEmployes.printMenu();

            // Demander à l'utilisateur de saisir son choix
            System.out.print("Entrez votre choix: ");
            int choix = scanner.nextInt();
            scanner.nextLine();  // Consommer la nouvelle ligne après la saisie du nombre

            // Exécution de l'action en fonction du choix de l'utilisateur
            switch (choix) {
                case 1: // Ajouter un employé
                    // Demande des informations sur l'employé à ajouter
                    System.out.print("Entrez l'ID de l'employé: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consommer la nouvelle ligne
                    System.out.print("Entrez le nom de l'employé: ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez le poste de l'employé: ");
                    String poste = scanner.nextLine();
                    System.out.print("Entrez le salaire de l'employé: ");
                    double salaire = scanner.nextDouble();

                    // Création de l'objet Employe et ajout à la gestion des employés
                    Employe nouvelEmploye = new Employe(id, nom, poste, salaire);
                    gestionEmployes.ajouterEmploye(nouvelEmploye);
                    break;

                case 2: // Modifier un employé
                    // Demande de l'ID de l'employé à modifier et des nouvelles informations
                    System.out.print("Entrez l'ID de l'employé à modifier: ");
                    int idModifier = scanner.nextInt();
                    scanner.nextLine(); // Consommer la nouvelle ligne
                    System.out.print("Entrez le nouveau nom: ");
                    String nouveauNom = scanner.nextLine();
                    System.out.print("Entrez le nouveau poste: ");
                    String nouveauPoste = scanner.nextLine();
                    System.out.print("Entrez le nouveau salaire: ");
                    double nouveauSalaire = scanner.nextDouble();

                    // Modification de l'employé
                    gestionEmployes.modifierEmploye(idModifier, nouveauNom, nouveauPoste, nouveauSalaire);
                    break;

                case 3: // Supprimer un employé
                    // Demande de l'ID de l'employé à supprimer
                    System.out.print("Entrez l'ID de l'employé à supprimer: ");
                    int idSupprimer = scanner.nextInt();

                    // Suppression de l'employé
                    gestionEmployes.supprimerEmploye(idSupprimer);
                    break;

                case 4: // Afficher tous les employés
                    // Affichage de la liste des employés
                    gestionEmployes.afficherEmployes();
                    break;

                case 5: // Rechercher un employé
                    // Demande du critère de recherche (nom ou poste)
                    System.out.print("Entrez le critère de recherche (nom ou poste): ");
                    String critere = scanner.nextLine();

                    // Recherche de l'employé correspondant au critère
                    gestionEmployes.rechercherEmploye(critere);
                    break;

                case 6: // Calculer la masse salariale
                    // Calcul de la somme des salaires des employés
                    gestionEmployes.calculerMasseSalariale();
                    break;

                case 7: // Trier les employés par salaire
                    // Demande si le tri doit être croissant ou décroissant
                    System.out.print("Trier par ordre croissant? (true/false): ");
                    boolean ordreCroissant = scanner.nextBoolean();

                    // Tri des employés selon le salaire
                    gestionEmployes.trierEmployesParSalaire(ordreCroissant);
                    break;

                case 0: // Quitter
                    // Affichage d'un message de fin et sortie de la boucle
                    System.out.println("Merci d'avoir utilisé l'application de gestion des employés.");
                    running = false;
                    break;

                default:
                    // Message d'erreur si le choix est invalide
                    System.out.println("Choix invalide, essayez à nouveau.");
                    break;
            }
        }
        // Fermeture du scanner à la fin
        scanner.close();
    }
}
