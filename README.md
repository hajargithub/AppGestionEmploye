# Application de Gestion des Employés

## 1. Introduction

Le projet **Application de Gestion des Employés** consiste à développer une application en Java permettant de gérer les employés d'une entreprise. Cette application permet d'ajouter, modifier, supprimer, afficher des employés, ainsi que de trier les employés par salaire (ordre croissant ou décroissant) et de calculer la masse salariale totale. Elle est réalisée en suivant les principes de **programmation orientée objet (POO)** pour garantir une structure claire et un code facilement maintenable.

## 2. Fonctionnalités de l'Application

### 2.1 Ajouter un Employé
L'utilisateur peut ajouter un employé en saisissant son identifiant (ID), son nom, son poste, et son salaire.

### 2.2 Modifier un Employé
L'application permet de modifier les informations d'un employé existant via son identifiant unique.

### 2.3 Supprimer un Employé
Les employés peuvent être supprimés de la liste en utilisant leur identifiant unique.

### 2.4 Afficher la Liste des Employés
Cette fonctionnalité permet d'afficher tous les employés enregistrés avec leurs informations détaillées.

### 2.5 Rechercher un Employé
L'utilisateur peut rechercher un employé par son nom ou par son poste.

### 2.6 Calculer la Masse Salariale
L'application calcule le total des salaires mensuels des employés présents dans le tableau.

### 2.7 Trier les Employés par Salaire
Les employés peuvent être triés par salaire, soit de manière croissante, soit de manière décroissante, en fonction de l'ordre choisi par l'utilisateur.

## 3. Étapes de Réalisation

### 3.1 Planification du Projet
1. **Conception de la structure des classes** : Création de la classe `Employe` pour représenter chaque employé et de la classe `GestionEmployes` pour gérer la liste des employés.
2. **Implémentation des fonctionnalités de base** : Ajout des méthodes permettant d'ajouter, de modifier et de supprimer des employés.
3. **Tri des employés par salaire** : Recherche d'une solution pour trier les employés par salaire (croissant ou décroissant).
4. **Calcul de la masse salariale** : Ajout de la fonctionnalité permettant de calculer la masse salariale totale.

### 3.2 Technologies Utilisées
- **Java** : Langage de programmation utilisé pour le développement de l'application.
- **POO (Programmation Orientée Objet)** : Utilisation des concepts de classes, objets, méthodes, et des principes de conception orientée objet pour structurer le code de manière modulaire.

### 3.3 Architecture de l'Application
L'application est composée de trois classes principales :
- **Classe `Employe`** : Contient les informations sur chaque employé (ID, nom, poste, salaire).
- **Classe `GestionEmployes`** : Gère les opérations sur la liste des employés (ajouter, modifier, supprimer, etc.).
- **Classe `Main`** : Gère l'interaction avec l'utilisateur via un menu et coordonne l'exécution de l'application.

## 4. Défis Rencontrés

### 4.1 Tri des Employés par Salaire
L'un des plus grands défis rencontrés a été la mise en œuvre de la méthode **`trierEmployesParSalaire`**, qui trie les employés dans un ordre spécifié (croissant ou décroissant). Le tri d'un tableau en spécifiant l'ordre n'est pas trivial et m'a conduit à faire des recherches approfondies.

### 4.2 Recherche sur le Tri d'un `ArrayList` en Spécifiant l'Ordre
Au début, j'avais des difficultés à comprendre comment trier un tableau en Java selon un ordre spécifique, soit croissant, soit décroissant. Après des recherches, j'ai trouvé que la méthode **`Arrays.sort()`** combinée avec un comparateur lambda était la meilleure solution.

Voici la méthode que j'ai utilisée pour trier les employés par salaire, selon l'ordre spécifié :

```java
public static void trierEmployesParSalaire(boolean ordreCroissant) {
    Arrays.sort(employes, 0, index, (e1, e2) -> 
        ordreCroissant ? Employe.compareParSalaire(e1, e2) : Employe.compareParSalaire(e2, e1)
    );
    afficherEmployes();
} ````java
Explication du Code :
Arrays.sort(employes, 0, index, ...) : Trie les employés dans le tableau employes de l'indice 0 jusqu'à l'indice index (nombre d'employés actuels).
(e1, e2) -> ... : Un lambda pour définir la logique de comparaison entre deux employés (e1 et e2).
ordreCroissant ? Employe.compareParSalaire(e1, e2) : Employe.compareParSalaire(e2, e1) : Si ordreCroissant est true, les employés sont triés par salaire croissant, sinon décroissant.
Cette approche a été une découverte pour moi et a permis de résoudre le problème de tri de manière simple et efficace.

## 5. Écrans montrant l'Exécution de Chaque Besoin
 ### 5.1 Menu Principal
Voici un aperçu du menu principal de l'application où l'utilisateur peut choisir parmi différentes options pour gérer les employés.

### 5.2 Ajout d'un Employé
L'utilisateur entre les informations pour ajouter un nouvel employé.


 ### 5.3 Tri des Employés par Salaire
Voici un écran montrant les employés triés par salaire, dans l'ordre croissant.


### 5.4 Calcul de la Masse Salariale
Affichage du calcul de la masse salariale totale de tous les employés.

