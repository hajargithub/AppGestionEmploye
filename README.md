Application de Gestion des Employés
1. Introduction
L'application de gestion des employés permet de gérer efficacement un tableau d'employés dans une entreprise. Les principales fonctionnalités de cette application incluent l'ajout, la modification, la suppression, l'affichage des employés, ainsi que le tri des employés par salaire, et le calcul de la masse salariale totale. Cette application est conçue en Java en utilisant les principes de programmation orientée objet (POO) pour assurer une structure modulaire et évolutive.

2. Fonctionnalités de l'Application
2.1 Ajouter un Employé
Les utilisateurs peuvent ajouter un nouvel employé en saisissant un identifiant unique, un nom, un poste, et un salaire.

2.2 Modifier un Employé
L'application permet de modifier les informations d'un employé existant à l'aide de son identifiant unique.

2.3 Supprimer un Employé
Un employé peut être retiré de la liste en utilisant son identifiant unique.

2.4 Afficher la Liste des Employés
Affiche la liste complète des employés enregistrés avec leurs informations détaillées.

2.5 Rechercher un Employé
Les utilisateurs peuvent rechercher un employé en fonction de son nom ou de son poste.

2.6 Calculer la Masse Salariale
Calcul du total des salaires mensuels des employés présents dans le tableau.

2.7 Trier les Employés par Salaire
Les employés peuvent être triés par salaire, soit de manière croissante, soit de manière décroissante, en fonction de l'ordre choisi par l'utilisateur.

3. Étapes de Réalisation
3.1 Planification du Projet
Le projet a été divisé en plusieurs étapes :

Conception de la structure des classes : Création de la classe Employe pour représenter chaque employé et la classe GestionEmployes pour gérer la liste des employés.
Implémentation des fonctionnalités de base : Ajout des méthodes permettant d'ajouter, modifier, et supprimer des employés.
Tri des employés par salaire : Recherche d'une solution pour trier les employés en fonction de leur salaire, en spécifiant l'ordre (croissant ou décroissant).
Calcul de la masse salariale : Ajout de la fonctionnalité permettant de calculer le total des salaires des employés.
3.2 Technologies Utilisées
Java : Langage de programmation pour le développement de l'application.
POO : Utilisation des concepts de la programmation orientée objet (classes, objets, méthodes, etc.) pour organiser et structurer le code.
3.3 Architecture de l'Application
L'application est constituée de trois classes principales :

Classe Employe : Représente un employé avec ses attributs (id, nom, poste, salaire), et inclut des méthodes pour accéder et modifier ces attributs.
Classe GestionEmployes : Contient toutes les méthodes nécessaires pour gérer la liste des employés, notamment pour l'ajout, la suppression, la modification et le tri des employés.
Classe Main : Contient la méthode main() pour démarrer l'application, afficher le menu, et permettre à l'utilisateur d'interagir avec le programme.
4. Défis Rencontrés
4.1 Tri des Employés par Salaire
L'un des défis majeurs rencontrés dans ce projet a été la mise en œuvre de la méthode trierEmployesParSalaire, notamment pour trier les employés dans un ordre spécifié (croissant ou décroissant). Le tri d'un tableau en spécifiant l'ordre n'est pas une tâche triviale et a nécessité des recherches approfondies.

4.2 Recherche sur le Tri d'un ArrayList en Spécifiant l'Ordre
Au début, j'avais du mal à comprendre comment trier un tableau (ou un ArrayList) en Java selon un ordre spécifique, croissant ou décroissant. Après plusieurs recherches et tests, j'ai découvert que la méthode Arrays.sort() combinée à un comparateur lambda était la solution idéale pour cela.

Voici le code que j'ai utilisé pour trier les employés par leur salaire, en fonction de l'ordre spécifié :

java
Copy
public static void trierEmployesParSalaire(boolean ordreCroissant) {
    Arrays.sort(employes, 0, index, (e1, e2) -> 
        ordreCroissant ? Employe.compareParSalaire(e1, e2) : Employe.compareParSalaire(e2, e1)
    );
    afficherEmployes();
}
Explication du Code :
Arrays.sort(employes, 0, index, ...) : Cette méthode trie les employés dans le tableau employes du premier élément (indice 0) jusqu'à l'élément à l'indice index (qui représente le nombre actuel d'employés dans le tableau).
(e1, e2) -> ... : Un lambda qui définit la logique de comparaison entre deux employés (e1 et e2) en fonction de leur salaire.
ordreCroissant ? Employe.compareParSalaire(e1, e2) : Employe.compareParSalaire(e2, e1) : Si ordreCroissant est vrai, la méthode compareParSalaire() trie les employés par salaire croissant, sinon, elle les trie par salaire décroissant.
Ce type de tri basé sur un lambda était une découverte importante pour moi et a permis de résoudre le problème de tri de manière simple et efficace.

5. Écrans montrant l'Exécution de Chaque Besoin
5.1 Menu Principal
Voici une capture d'écran du menu principal où l'utilisateur peut choisir différentes options pour gérer les employés :


5.2 Ajout d'un Employé
L'écran suivant montre l'interface où l'utilisateur entre les informations d'un nouvel employé pour l'ajouter à la liste.


5.3 Tri des Employés par Salaire
Voici une capture des employés triés par salaire, dans l'ordre croissant :


5.4 Calcul de la Masse Salariale
Cette capture montre l'affichage du calcul de la masse salariale totale de tous les employés :
