# Étape 1 : Utiliser une image de base OpenJDK
FROM openjdk:17-jdk-slim

# Étape 2 : Copier le fichier .jar généré dans le conteneur
COPY target/AmalGhozziTPFoyer-0.0.1.jar /app/AmalGhozziTPFoyer-0.0.1.jar

# Étape 3 : Exposer le port de l'application Spring Boot (par défaut 8080)
EXPOSE 8080

# Étape 4 : Définir la commande de démarrage pour exécuter le fichier .jar
ENTRYPOINT ["java", "-jar", "/AmalGhozziTPFoyer-0.0.1.jar"]