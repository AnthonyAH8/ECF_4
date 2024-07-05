# Gestion des Ressources Humaines

## Description

Ce projet est conçu pour moderniser le système de gestion des ressources humaines d'une entreprise en développant deux applications distinctes :
1. **Application de Gestion des Employés** : développée en JEE JAX-RS.
2. **Application de Gestion des Recrutements** : développée en Spring Boot.

Ces applications permettent de gérer efficacement les employés et le recrutement, en offrant des fonctionnalités CRUD complètes et des recherches avancées.

## Technologies

### Application de Gestion des Employés

- **Backend** : Java EE, JAX-RS, JPA, Hibernate
- **Base de données** : MySQL/PostgreSQL

### Application de Gestion des Recrutements

- **Backend** : Spring Boot, Spring Data JPA
- **Frontend** : Thymeleaf, Angular, ou React (au choix)
- **Base de données** : MySQL/PostgreSQL

## Installation

### Prérequis

- Java 8 ou supérieur
- Maven
- MySQL ou PostgreSQL
- Docker (optionnel, pour containerisation)

### Étapes d'installation

#### Application de Gestion des Employés

1. Clonez le dépôt :

   ```bash
     git clone https://github.com/username/gestion-rh.git
     cd gestion-rh/gestion-employes
   ```

2. Configurez la base de données dans le fichier **persistance.xml**
   ```bash
      <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/gestion_rh"/>
      <property name="javax.persistence.jdbc.user" value="root"/>
      <property name="javax.persistence.jdbc.password" value="password"/>
  ```
