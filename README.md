# PracticeEz

**PracticeEz** est un plugin Minecraft développé en **Java**. Ce dépôt contient son code source et les fichiers nécessaires à son développement.

> **Statut :** version `0.0.1` — projet en développement.

## Informations techniques

| Propriété | Valeur |
| --- | --- |
| Nom du plugin | `PracticeEz` |
| Langage | Java |
| Version déclarée | `0.0.1` |
| Classe principale | `antox11200.practice.fr.Practice` |
| Auteur déclaré | `Antox11200` |
| Commande déclarée | `/practice` |

Ces informations proviennent du fichier `plugin.yml` du projet.

## Structure du projet

```text
Practice/
├── .settings/
├── src/
│   └── antox11200/
│       └── practice/
│           └── fr/
├── .classpath
├── .gitignore
├── .project
└── plugin.yml
```

Le dépôt comprend les fichiers de configuration d'un projet Java Eclipse (`.project` et `.classpath`), ainsi que le descripteur du plugin Minecraft (`plugin.yml`).

## Installation

### Pour les développeurs

1. Clonez le dépôt :

   ```bash
   git clone https://github.com/BDoryan/Practice.git
   cd Practice
   ```

2. Importez le projet dans votre IDE Java (par exemple, Eclipse).
3. Configurez les dépendances de l'API serveur Minecraft correspondant à la version visée.
4. Compilez le projet sous forme de fichier JAR, en incluant `plugin.yml` à la racine de l'archive.

> Le dépôt ne contient pas de configuration de compilation Maven ou Gradle visible à sa racine. La version Java et la version de serveur compatibles restent à préciser.

### Pour les administrateurs de serveur

Une fois un JAR compatible généré :

1. Arrêtez votre serveur Minecraft compatible avec l'API utilisée par le plugin.
2. Placez le fichier JAR dans le dossier `plugins/`.
3. Redémarrez le serveur.
4. Vérifiez le chargement du plugin dans les journaux du serveur.

## Commandes

| Commande | Description |
| --- | --- |
| `/practice` | Commande principale déclarée dans `plugin.yml`. Son comportement est à documenter. |

## Développement

Le projet est actuellement dans une version initiale. Les fonctionnalités disponibles, les permissions et les versions de Minecraft prises en charge pourront être documentées à mesure de son évolution.

## Auteur

- **Antox11200** — auteur déclaré dans `plugin.yml`.
- **Dépôt GitHub :** [BDoryan/Practice](https://github.com/BDoryan/Practice)

## Licence

Aucun fichier de licence n'est actuellement présent à la racine du dépôt. Les conditions de réutilisation du code ne sont donc pas précisées.
