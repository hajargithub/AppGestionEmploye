import java.util.Arrays;

public class GestionEmployes {
    private static Employe[] employes = new Employe[50];
    private static int index = 0;

    public static void printMenu() {
        System.out.println("1. Ajouter un employé");
        System.out.println("2. Modifier un employé");
        System.out.println("3. Supprimer un employé");
        System.out.println("4. Afficher les employés");
        System.out.println("5. Rechercher un employé");
        System.out.println("6. Calculer la masse salariale");
        System.out.println("7. Trier les employés par salaire");
        System.out.println("0. Quitter");
    }

    public static void ajouterEmploye(Employe employe) {
//  Vérifier qu’un tableau n'est pas plein avant d’ajouter un nouvel employé.
        if (index < 50) {
            employes[index++] = employe;
            System.out.println("Employé ajouté!");
        } else {
            System.out.println("Limite de 50 employés atteinte.");
        }
    }

    public static void modifierEmploye(int id, String nouveauNom, String nouveauPoste, double nouveauSalaire) {
        for (int i = 0; i < index; i++) {
            if (employes[i].getId() == id) {
                employes[i].setNom(nouveauNom);
                employes[i].setPoste(nouveauPoste);
                employes[i].setSalaire(nouveauSalaire);
                System.out.println("Employé modifié!");
                return;
            }
        }
        System.out.println("Employé non trouvé.");
    }

    public static void supprimerEmploye(int id) {
        // Parcours du tableau pour trouver l'employé avec l'ID donné
        for (int i = 0; i < index; i++) {
            if (employes[i].getId() == id) {
                // Décalage des éléments à gauche pour combler l'espace vide
                for (int j = i; j < index - 1; j++) {
                    employes[j] = employes[j + 1];
                    // Décale chaque employé d'une position vers la gauche
                }
                // Mise à null du dernier employé,ce qui supprime la référence à l'objet à cet endroit.
                // --index décrémente la valeur de index de 1 en réduisant index.
                // ce qui  ajuste la longueur logique du tableau
                employes[--index] = null;
                System.out.println("Employé supprimé!");
                return;
            }
        }
        System.out.println("Employé non trouvé.");
    }


    public static void afficherEmployes() {
        if (index == 0) {
            System.out.println("Aucun employé dans la liste.");
            return;
        }
        for (Employe employe : employes) {
            if (employe != null) { // Vérification pour éviter de tenter d'afficher des éléments null
                System.out.println(employe);
            }
        }
    }

    public static void rechercherEmploye(String critere) {
        for (int i = 0; i < index; i++) {
            if (employes[i].getNom().contains(critere) || employes[i].getPoste().contains(critere)) {
                System.out.println(employes[i]);
                //return est appelé, ce qui a pour effet de quitter immédiatement la méthode,
                // et donc d'arrêter la recherche. Cela signifie que la recherche s'arrête dès qu'un employé correspondant est trouvé,
                // et le reste du tableau n'est pas exploré.
                return;
            }
        }
        System.out.println("Aucun employé trouvé.");
    }

    public static void calculerMasseSalariale() {
        double totalSalaire = 0;
        for (int i = 0; i < index; i++) {
            totalSalaire += employes[i].getSalaire();
        }
        System.out.println("La masse salariale totale est: " + totalSalaire);
    }

    /*Explication détaillée :
            Arrays.sort(employes, 0, index, ...) :
            Arrays.sort() est une méthode de la classe Arrays qui permet de trier un tableau.
    Le tableau employes est trié de la position 0 jusqu'à index (l'indice actuel du tableau). Le paramètre index représente le nombre actuel d'employés dans le tableau, donc cette méthode trie uniquement les employés existants.
    Le comparateur (...) -> ... :
    Cette partie du code définit un lambda (fonction anonyme) qui sert de comparateur pour le tri. Elle compare deux employés (e1 et e2) par leur salaire.
    ordreCroissant ? Employe.compareParSalaire(e1, e2) : Employe.compareParSalaire(e2, e1) :
    Si ordreCroissant est true, la méthode compareParSalaire(e1, e2) est utilisée pour trier les employés dans l'ordre croissant.
    Si ordreCroissant est false, on inverse l'ordre des arguments dans la méthode compareParSalaire pour trier les employés dans l'ordre décroissant.
    afficherEmployes() :
    Après le tri, la méthode afficherEmployes() est appelée pour afficher la liste des employés triés.*/
    public static void trierEmployesParSalaire(boolean ordreCroissant) {
        Arrays.sort(employes, 0, index, (e1, e2) -> ordreCroissant ? Employe.compareParSalaire(e1, e2) : Employe.compareParSalaire(e2, e1));
        afficherEmployes();
    }
}


