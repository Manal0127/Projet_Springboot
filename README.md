# Projet – Application Spring Boot : Gestion des Inscriptions

Ce projet consiste à créer une application web de gestion des inscriptions scolaires, avec formulaire et base de données intégrée.

## Objectif
Créer un formulaire d’inscription pour une école, avec une base de données pour stocker les données.

### Fonctionnalités
- Champs du formulaire :
  - Nom
  - Prénom
  - Email
  - Niveau d’études (L1, L2, L3, Master)
- Bouton **"S’inscrire"** qui enregistre l’inscription dans la base de données.
- Une page secondaire affiche dynamiquement la **liste des inscrits**.

### Architecture (MVC)
- **Back-end** : Java + Spring Boot
- **Front-end** : Thymeleaf + Bootstrap
- **Base de données** : H2 (persistante)
- **Organisation** :
  - Modèle : `Inscription.java`
  - Contrôleur : `InscriptionController.java`
  - Vue : `inscription.html`, `liste.html`
