package fr.dolleans.myApi.controller;

//import fr.dolleans.myApi.model.User;

// CLASSE UserRequest
public class UserRequest {
    private String name;
    private int age;

// CONSTRUCTEUR
    public UserRequest(String name, int age) {
        this.name = name;
        this.age = age;

    }
    // GETTERS ET SETTERS POUR  NAME ET AGE (MAIS ON RETIRE SETTERS CAR PAS DEMANDE n'empeche on peut les garder) 

    public String getName() {
        return name;
    }
    //public void setName(String name) {
       // this.name = name;
    //}
    public int getAge() {
        return age;
    }
   // public void setAge(int age) {
       // this.age = age;
    //}
  
    
}
/* EXERCICE 2 Vous allez vous rendre dans le dossier « controller » à l’intérieur de votre dossier « myApi ».
Dans ce dossier, vous y créerez un fichier nommé « UserRequest.java ». Ce fichier de requête 
servira à réceptionner les informations pour créer un nouvel utilisateur. Ce fichier contiendra 
une classe « UserRequest ». Vous déclarerez 2 variables privées dans cette classe : 
- Une variable de type « String » nommée « name ».
- Une variable de type « Integer » nommée « age ».
Vous devrez également y intégrer un constructeur prenant en paramètres les variables
« name » et « age » pour initialiser les variables d'instance de la classe.
4/4
©2023 – Héloïse DE VILLEPIN
Vous déclarerez les méthodes « getters » pour les variables d'instance « name » et « age ».*/