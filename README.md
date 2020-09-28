# Trip Agency sample

## WARNING FOR MAVEN USERS: THE 'TARGET' FOLDER IS REPLACED BY A FOLDER NAMED 'BUILD'
And this for two reasons:
- the first is that 'build' is more accurate than 'target'
- the second is that it is the same as gradle
We can say that we killed two birds with one stone.


## Summary
- [Sample goals](#1-sample-goals)
- [Wrappers and practices to build](#2-wrappers-and-practices-to-build)
  - [Maven wrapper](#2-1-Maven-wrapper)
  - [Gradle wrapper](#2-2-Gradle-wrapper)
  - [Bom for Bills of Materials](#2-3-Bom-for-Bills-Of-Materials)
- [xDD](#3-xDD)
  - [DDD](#3-1-DDD)
  - [BDD](#3-2-BDD)
  - [TDD](#3-3-TDD)
- [Living Documentation](#4-Living-Documentation)
- [Hexagonal architecture](#5-Hexagonal-architecture)
- [DataBase Managing tool](#6-DataBase-Managing-tool)
- [I18n](#7-I18n)
- [CI/CD best practices](#8-CICD-best-practices)
- [Let's make it work](#9-Lets-make-it-work)

## 1 - Sample goals
This sample was made to provide a concrete example on some best practices of the market regarding a java application providing Rest API.  
Everything may be not perfect. This sample will always be on WIP.  
Be kind and don't hesitate to do some PR/MR ^^  
Everyone is welcome!  


This sample has many goals:
- to use best building tools practices: use of BOM (Bills Of Materials) and wrapper (MavenWrapper and GradleWrapper in this sample)
- to teach the basis of automated tests based on Cucumber (Behaviour Driven Development)
- to generate a living documentation based on the tests
- to use the hexagonal architecture, an architectural pattern that allows dissociating the domain code from the technical 
code and ease also the tests implementation without infrastructure
- to use i18n (internationalization)
- to use best practices for CI/CD pipelines (shell scripts in the project to be used in the different CI servers)
- to use a database managing tools (liquibase here)

## 2 Wrappers and practices to build
to fill
### 2-1  Maven wrapper
to fill
### 2-2 Gradle wrapper
to fill
### 2-3 Bom for Bills Of Materials
to fill
##3 xDD
to fill
### 3-1 DDD
to fill
### 3-2 BDD
to fill
### 3-3 TDD
to fill
## 4 Living Documentation
to fill
## 5 Hexagonal architecture
to fill
## 6 DataBase Managing tool
to fill
## 7 I18n
to fill
## 8 CI/CD best practices
to fill
## 9 Let's make it work
to fill

## 3 - Make it work
you can start the rest exposition by executing the following command line in the exposition folder:  
**mvn clean spring-boot:run**  

The url to use the service is the following:  
**http://localhost:12378/trip-agency/swagger-ui/**

## 4 - Kata solution software architecture
### DDD
Ubiquitous language

### BDD
Specifications by examples implemented with Cucumber

### Living documentation
Cukedoctor  
See in the following repository in the domain module : domain/target/TripAgency   
You should see a pdf file containing the results of the cucumber tests.

### Testing tools
AssertJ + Mockito + Cucumber

### Hexagonal architecture
Multi modules: 
- domain (the most important module)
- infrastructure (infrastructure repository) and exposition (infrastructure driver) for the technical ones

### Liquibase
Database version control and deployment

### Rest exposition 
Swagger2
