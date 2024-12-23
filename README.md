# CyberChallenge
projet d'application web/mobile de challenges en cybersécurité crée par Hanaé Lopez et Mimouni Aïcha (soutenu par le Pôle d'Excellence Cyber pour les Cadettes de la Cyber https://www.pole-excellence-cyber.org)

# Cyber Challenge - Spring Boot Microservice

Bienvenue dans **Cyber Challenge**, un projet ludique conçu pour mettre vos compétences en sécurité informatique à l'épreuve. Ce projet utilise **Spring Boot** pour créer une application microservice interactive qui propose des défis de cryptographie et de cybersécurité.

---

## 🚀 Fonctionnalités

- Génération d'un message chiffré.
- Vérification des soumissions de drapeaux (*flags*).
- Gestion des indices pour aider les participants.
- Design attractif avec un style CSS personnalisé.
- Compatible avec des bases de données comme H2 pour stocker les données utilisateur.

---

## 📂 Structure du projet

CyberChallenge/ ├── src/ │ 
                  ├── main/ │ │ 
                        ├── java/com/cyber/ │ │ │ ├── controller/ # Contrôleurs du backend │ │ │ 
                           ├── CyberChallengeApplication.java # Point d'entrée de l'application │ │ 
                              ├── resources/ │ │ │ 
                                 ├── static/ # Fichiers CSS/JS │ │ │ │ 
                                    ├── styles.css # Fichier CSS principal │ │ │ 
                                    ├── templates/ # (Si applicable) Modèles HTML pour Thymeleaf │ │ │ 
                                 ├── application.properties # Configuration Spring Boot ├── pom.xml # Fichier de configuration Maven 
                        └── README.md # Documentation du projet


---

## 🛠️ Prérequis

- **Java 17** ou version ultérieure.
- **Maven** pour gérer les dépendances.
- Un IDE comme **Spring Tool Suite (STS)** ou **Eclipse**.

---

# Cyber Challenge - Spring Boot Microservice

Bienvenue dans **Cyber Challenge**, un projet ludique conçu pour mettre vos compétences en sécurité informatique à l'épreuve. Ce projet utilise **Spring Boot** pour créer une application microservice interactive qui propose des défis de cryptographie et de cybersécurité.

---

## 🚀 Fonctionnalités

- Génération d'un message chiffré.
- Vérification des soumissions de drapeaux (*flags*).
- Gestion des indices pour aider les participants.
- Design attractif avec un style CSS personnalisé.
- Compatible avec des bases de données comme H2 pour stocker les données utilisateur.

---

## 🛠️ Prérequis

- **Java 17** ou version ultérieure.
- **Maven** pour gérer les dépendances.
- Un IDE comme **Spring Tool Suite (STS)** ou **Eclipse**.

---

## ▶️ Lancer l'application

1. Clonez ce dépôt :
   ```bash
   git clone https://github.com/<votre-utilisateur>/CyberChallenge.git
   cd CyberChallenge

2. Compilez et exécutez l'application 
./mvnw spring-boot:run

3. Accédez à l'application dans votre navigateur à l'adresse : http://localhost:8080

📜 Configuration

Le fichier application.properties contient les paramètres principaux de l'application. Voici les paramètres par défaut :

# Port du serveur
server.port=8080

# H2 Console
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

📋 Dépendances principales

Spring Boot (3.x)
Spring Boot Web : pour le développement d'API REST.
Spring Boot Data JPA : pour l'intégration des bases de données.
H2 Database : pour une base de données embarquée.
Lombok : pour réduire le code boilerplate.
Maven : pour gérer les dépendances et le cycle de vie du projet.

✨ Contribuer

1. Forkez ce projet.
2. Créez votre branche : git checkout -b feature/ma-fonctionnalité
3. Ajoutez vos modifications : git add .
                               git commit -m "Ajout de ma fonctionnalité"
4. Poussez vos modifications : git push origin feature/ma-fonctionnalité
5. Ouvrez une Pull Request.

🛡️ Sécurité

Ce projet inclut des défis de sécurité. Si vous trouvez des vulnérabilités, merci de créer une issue ou de contacter directement l'auteur.

🖼️ Aperçu

<img src="https://via.placeholder.com/800x400?text=Capture+de+l'application" alt="Aperçu de l'application" />

📜 Licence

Ce projet est sous licence du PEC (Pôle Excellence Cyber). Consultez le fichier LICENSE pour plus de détails.

📧 Contact

Pour toute question ou suggestion, vous pouvez me contacter à : mimouni.a@hotmail.fr ou hanae.lopez@isen.yncrea.fr


---

### Instructions supplémentaires
1. Remplacez `<votre-utilisateur>` dans le lien de clone par votre nom d'utilisateur GitHub.
2. Ajoutez une capture d'écran ou une bannière d'illustration pour rendre la page d'accueil plus attrayante.
3. Mettez à jour les coordonnées dans la section **Contact**. 

Ce fichier donne un aperçu clair et complet de votre projet pour les futurs contributeurs et utilisateurs. 🚀


