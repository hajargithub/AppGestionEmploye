
# Application de Gestion des Employés

## 1. Introduction

Le projet **Application de Gestion des Employés** est une application Java conçue pour gérer les employés d'une entreprise. Elle permet d'ajouter, de modifier, de supprimer, et d'afficher des employés, ainsi que de trier les employés par salaire (croissant ou décroissant) et de calculer la masse salariale totale. L'application est développée en utilisant les principes de **programmation orientée objet (POO)** pour garantir une structure modulaire et maintenable.

## 2. Fonctionnalités de l'Application

### 2.1 Ajouter un Employé
L'utilisateur peut ajouter un employé en saisissant un identifiant unique, un nom, un poste, et un salaire.

### 2.2 Modifier un Employé
L'application permet de modifier les informations d'un employé existant à partir de son identifiant unique.

### 2.3 Supprimer un Employé
Les employés peuvent être supprimés de la liste en utilisant leur identifiant unique.

### 2.4 Afficher la Liste des Employés
Cette fonctionnalité permet d'afficher tous les employés enregistrés avec leurs informations détaillées (ID, nom, poste, salaire).

### 2.5 Rechercher un Employé
L'utilisateur peut rechercher un employé par son nom ou par son poste.

### 2.6 Calculer la Masse Salariale
L'application calcule le total des salaires mensuels des employés présents dans le tableau, permettant ainsi de connaître la masse salariale totale de l'entreprise.

### 2.7 Trier les Employés par Salaire
Les employés peuvent être triés par salaire, soit de manière croissante, soit de manière décroissante, en fonction de l'option choisie par l'utilisateur.

## 3. Étapes de Réalisation

### 3.1 Planification du Projet
1. **Conception de la structure des classes** : J'ai créé la classe `Employe` pour représenter chaque employé et la classe `GestionEmployes` pour gérer la liste des employés.
2. **Implémentation des fonctionnalités de base** : J'ai ajouté les méthodes permettant d'ajouter, de modifier et de supprimer des employés.
3. **Tri des employés par salaire** : J'ai recherché une méthode efficace pour trier les employés par salaire, en permettant le choix de l'ordre (croissant ou décroissant).
4. **Calcul de la masse salariale** : J'ai ajouté la fonctionnalité permettant de calculer la masse salariale totale des employés.

### 3.2 Technologies Utilisées
- **Java** : Le langage utilisé pour le développement de l'application.
- **POO (Programmation Orientée Objet)** : Les concepts de classes, objets, méthodes, et d'encapsulation sont utilisés pour structurer le code de manière modulaire.

### 3.3 Architecture de l'Application
L'application est composée de trois classes principales :
- **Classe `Employe`** : Contient les informations sur chaque employé, telles que l'ID, le nom, le poste et le salaire.
- **Classe `GestionEmployes`** : Contient les méthodes pour gérer la liste des employés (ajout, suppression, modification, tri).
- **Classe `Main`** : Permet l'interaction avec l'utilisateur via un menu et coordonne l'exécution du programme.

## 4. Défis Rencontrés

### 4.1 Tri des Employés par Salaire
L'un des plus grands défis rencontrés a été la mise en œuvre de la méthode **`trierEmployesParSalaire`**, qui trie les employés selon l'ordre spécifié (croissant ou décroissant). Le tri d'un tableau en Java en fonction d'un critère spécifique n'est pas toujours simple et nécessite une compréhension approfondie des comparateurs.

### 4.2 Recherche sur le Tri d'un `ArrayList` en Spécifiant l'Ordre
Au début, j'avais des difficultés à comprendre comment trier un tableau (ou un **ArrayList**) en Java en spécifiant l'ordre (croissant ou décroissant). Après plusieurs recherches, j'ai découvert que la méthode **`Arrays.sort()`** combinée avec un **comparateur lambda** était la solution idéale.

Voici la méthode utilisée pour trier les employés par salaire, selon l'ordre spécifié :

```java
public static void trierEmployesParSalaire(boolean ordreCroissant) {
    Arrays.sort(employes, 0, index, (e1, e2) -> 
        ordreCroissant ? Employe.compareParSalaire(e1, e2) : Employe.compareParSalaire(e2, e1)
    );
    afficherEmployes();
}
```
**Explication du Code** :
- `Arrays.sort(employes, 0, index, ...) `: Trie les employés dans le tableau employes du premier élément `(indice 0)` jusqu'à l'indice index, représentant le nombre d'employés actuels.
- `(e1, e2) -> ... `: Un lambda qui définit la logique de comparaison entre deux employés (e1 et e2).
- `ordreCroissant ? Employe.compareParSalaire(e1, e2)` : Employe.compareParSalaire(e2, e1) : Si ordreCroissant est true, les employés sont triés par salaire croissant, sinon décroissant.
Ce type de tri basé sur un lambda était une découverte importante pour moi et m'a permis de résoudre facilement ce problème de tri.

## 5. Écrans montrant l'Exécution de Chaque Besoin

### 5.1 Menu Principal
Voici un aperçu du menu principal de l'application, où l'utilisateur peut choisir parmi différentes options pour gérer les employés.
![image](https://github.com/user-attachments/assets/6bf975d5-2846-4132-b80a-bda5db95790f)


### 5.2 Ajout d'un Employé
L'utilisateur entre les informations pour ajouter un nouvel employé.
![image](https://github.com/user-attachments/assets/610893f9-e24a-4c29-b7e4-c3657cd44bc0)


### 5.3 Tri des Employés par Salaire
Voici un écran montrant les employés triés par salaire, dans l'ordre croissant.
![image](https://github.com/user-attachments/assets/18585c80-4441-4e4a-ba4e-8e76b1fd63b2)


Voici un écran montrant les employés triés par salaire, dans l'ordre décroissant.
![image](https://github.com/user-attachments/assets/e70ac806-29ee-4bd0-825c-73ba44821b85)


### 5.4 Calcul de la Masse Salariale
Affichage du calcul de la masse salariale totale des employés présents.
![image](https://github.com/user-attachments/assets/f54dfd2c-3f63-4b7b-9f06-3844c5815a2c)


### 5.5 Modifier un employé existant.
![image](https://github.com/user-attachments/assets/a6f2007b-bec2-402d-aede-04796674a617)


### 5.6 Supprimer un employé du tableau à l’aide de son identifiant.
![image](https://github.com/user-attachments/assets/7c595560-7ef9-404e-b7a8-cc28fcf11e60)


### 5.7Trouver un employé par son nom ou son poste.
![image](https://github.com/user-attachments/assets/333a0778-c4ad-4245-8f44-77dd598a5219)



## 7. Conclusion
Ce projet m'a permis de mettre en pratique les concepts fondamentaux de programmation orientée objet en Java, tout en résolvant des défis techniques comme le tri d'un tableau en fonction d'un ordre spécifique. L'utilisation des lambdas et des comparateurs pour trier les employés par salaire a été une expérience enrichissante et m'a permis de mieux comprendre les fonctionnalités avancées de Java.
L'application peut être facilement étendue pour ajouter de nouvelles fonctionnalités, telles que l'intégration avec une base de données ou la gestion des départements.




