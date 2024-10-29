# HealthIndexProcessor

HealthIndexProcessor est un projet Java qui analyse l'index de santé d'un patient, donné par une cabine d'auto-diagnostic, pour identifier la ou les pathologies potentielles et orienter automatiquement le patient vers le(s) service(s) médical(aux) approprié(s).

## Contexte du Projet

Dans un hôpital futuriste, une cabine d’auto-diagnostic mesure l'index de santé d’un patient grâce à un capteur. L’objectif de ce projet est de créer une application qui interprète cet index pour détecter des pathologies spécifiques :

- **Index multiple de 3** : Indique un problème cardiaque et redirige vers le service de **cardiologie**.
- **Index multiple de 5** : Indique une fracture et redirige vers le service de **traumatologie**.
- **Index multiple de 3 et 5** : Indique les deux pathologies et redirige vers **cardiologie et traumatologie**.

## Fonctionnalités

- **Analyse de l'index de santé** : Analyse l'index pour déterminer s'il est multiple de 3, de 5, ou des deux.
- **Orientation automatique** : Retourne le(s) service(s) médical(aux) correspondant(s) en fonction des pathologies détectées.
- **Gestion des cas particuliers** : Si l'index ne correspond à aucun multiple spécifique, retourne "Aucun service requis".

## Structure du Projet

Le projet se compose principalement des classes suivantes :

- `HealthIndexProcessor` : Classe principale contenant la logique d'analyse de l'index de santé.
- `HealthIndexProcessorTest` : Classe de tests unitaires pour valider le bon fonctionnement de la logique de redirection des patients.

## Prérequis

- **Java 8** ou version supérieure
- **JUnit 5** pour l'exécution des tests unitaires
- **JaCoCo** pour la couverture des tests

## Installation

1. Clonez le dépôt :

   ```bash
   git clone https://github.com/redaTaha95/HealthIndexProcessor

2. Naviguez dans le dossier du projet :

    ```bash
   cd HealthIndexProcessor

3. Compilez le projet :

    ```bash
   javac -d bin src/*.java

4. Exécutez les tests unitaires (si vous utilisez Maven) :
    
    ```bash
   mvn test

## Utilisation
Vous pouvez utiliser la classe `HealthIndexProcessor` pour obtenir le service médical approprié pour un index de santé donné :

```java
public class Main {
public static void main(String[] args) {
    HealthIndexProcessor processor = new HealthIndexProcessor();
    int healthIndex = 33;
    String result = processor.getMedicalUnit(healthIndex);
    System.out.println("Service recommandé : " + result);
    }
}
```

## Exemple de résultats
- Pour healthIndex = 33, le système renvoie Cardiologie.
- Pour healthIndex = 55, le système renvoie Traumatologie.
- Pour healthIndex = 15, le système renvoie Cardiologie, Traumatologie.
- Pour healthIndex = 7, le système renvoie Aucun service requis.

## Couverture des Tests
Ce projet utilise JaCoCo pour mesurer la couverture des tests. Le rapport de couverture est généré dans le répertoire `target/site/jacoco/index.html` après l'exécution des tests.

## Générer le Rapport de Couverture
* Pour générer et visualiser la couverture de code :

    ```bash
  mvn clean test

Le rapport de couverture sera accessible dans `target/site/jacoco/index.html`.

## Exemple de Résultat de Couverture de Code
Après avoir exécuté `mvn clean test`, ouvrez le fichier `index.html` généré pour voir les statistiques de couverture, comme par exemple :

- Couverture des lignes : 100%
- Couverture des branches : 100%

## Tests
Les tests unitaires pour `HealthIndexProcessor` sont inclus dans `HealthIndexProcessorTest.java`. Ils couvrent les différents cas d'usage, notamment :

- Multiples de 3 uniquement
- Multiples de 5 uniquement
- Multiples de 3 et 5
- Aucun multiple correspondant
- Cas spécial pour un index de 0

Pour exécuter les tests :

```bash
mvn test
```

Développé avec ❤️ par Reda TAHA.
