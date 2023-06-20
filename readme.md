# Gestionnaire de stock

Ce projet est un gestionnaire de stock simple implémenté en Java. Il vous permet de gérer les produits et les commandes associées. Le programme fournit les fonctionnalités suivantes :

- Ajouter un produit au stock
- Supprimer un produit du stock
- Mettre à jour les informations d'un produit existant
- Passer une commande
- Afficher les détails des produits et des commandes

## Prérequis

Avant de pouvoir exécuter le programme, vous devez vous assurer que votre environnement de développement Java est correctement configuré. Vous devez avoir Java Development Kit (JDK) installé sur votre système.

## Installation

1. Clonez le dépôt GitHub dans votre répertoire local :

git clone https://github.com/TomGiDev/GestionnaireStock.git


2. Accédez au répertoire du projet :

cd GestionnaireStock


3. Compilez le programme à l'aide de la commande suivante :

Build l'application : mvn install

## Utilisation

Une fois le programme compilé avec succès, vous pouvez l'exécuter en utilisant la commande suivante :

java -jar target/Gestionnaire-de-stock-0.0.1-SNAPSHOT.jar



Le programme vous présentera un menu interactif avec différentes options. Vous pouvez sélectionner l'option appropriée en entrant le numéro correspondant.

Lorsque vous ajoutez un produit au stock ou passez une commande, le programme vous demandera de fournir les informations nécessaires, telles que le nom du produit, la quantité, le prix, etc.

## Structure du projet

Le projet est organisé de la manière suivante :


- `Product.java` : La classe représentant un produit, avec ses attributs et méthodes associés.
- `Order.java` : La classe représentant une commande, avec ses attributs et méthodes associés.
- `README.md` : Ce fichier README.
