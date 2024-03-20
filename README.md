
### Bilan d'Avancement du Projet Système de Paris avec OpenXava

#### Résumé Général du Projet
- **Objectif du Projet** : Développer un système de paris en ligne utilisant OpenXava qui permet aux utilisateurs (parieurs et bookmakers) de s'inscrire, de se connecter, de placer des paris et de gérer leurs comptes.
- **Statut actuel** : En cours

#### Avancement Jusqu'à Présent
- **Conception du Système** : Finalisée. La conception inclut la modélisation des données, l'architecture du système et l'interface utilisateur.
- **Développement de la Base de Données** : Complété. La structure de la base de données nécessaire pour gérer les utilisateurs, les paris, et les résultats a été implémentée et testée.
  - Connexion des utilisateurs : En cours. La fonctionnalité permettant aux parieurs et aux bookmakers de se connecter est actuellement en développement.

#### Points Clés sur l'Avancement Actuel
- **Partie Connexion du Parieur et du Bookmaker** :
  - **Avancement** : La partie connexion est en cours de développement. Nous avons finalisé la conception de l'interface de connexion et le backend pour la gestion des sessions.
  - **Prochaines Étapes** : Finaliser les tests de sécurité pour l'authentification et intégrer les feedbacks des utilisateurs pilotes.

#### Prochaines Étapes et Planification
- **Finalisation de la Connexion** :  cela inclut le peaufinage des fonctionnalités de sécurité et l'ajustement basé sur les retours des premiers testeurs.
- **Développement des Fonctionnalités Suivantes** : Après la connexion, le projet se concentrera sur d'autres fonctionnalités, avec un planning détaillé pour chaque étape.

#### Défis Rencontrés et Solutions Apportées
-Défi : Le principal défi actuel est de gérer la connexion des différents types d'utilisateurs (parieurs et bookmakers) de manière à ce qu'ils accèdent à des pages spécifiques adaptées
à leur rôle après la connexion.

Solutions Apportées :

Identification des Rôles Utilisateurs : Implémentez une gestion des rôles dans votre système d'authentification. Chaque utilisateur se voit attribuer un rôle (par exemple, parieur ou bookmaker) 
lors de  sa connexion. Cette information est stockée de manière sécurisée dans la base de données.

Amélioration du Système d'Authentification : Modifiez le système d'authentification pour qu'il récupère le rôle de l'utilisateur lors de la connexion et stocke cette information, par exemple dans un jeton de session ou un cookie sécurisé, qui sera ensuite utilisé pour déterminer l'accès aux différentes parties de l'application.

Implémentation de la Logique de Redirection : Développez une logique de redirection post-connexion basée sur le rôle de l'utilisateur. Ci dessous quelques images:
![sport](https://github.com/desireeDev/Bmo_Project/assets/114066560/3ac99787-d8d8-41e4-b02e-40ab59f234ca)
![PARIEUR](https://github.com/desireeDev/Bmo_Project/assets/114066560/a8b5f462-4674-4b4b-bcb5-e672544e2d0e)

![list](https://github.com/desireeDev/Bmo_Project/assets/114066560/ff10378f-78ab-4a18-b2b5-db4724417732)

![connexion](https://github.com/desireeDev/Bmo_Project/assets/114066560/510fd67a-05ff-41ae-8a8b-df9f60c17ac2)

