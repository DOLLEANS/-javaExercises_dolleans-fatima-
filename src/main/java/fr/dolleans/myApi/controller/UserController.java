package fr.dolleans.myApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.dolleans.myApi.model.User;
import fr.dolleans.myApi.service.UserService;

/*
Vous allez créer un dossier « controller » dans votre dossier « myApi », ce qui donnera un package « com.example.myApi.controller ».
 
Ce package servira à recevoir les appels à l’API et à traiter les données. Dans ce dossier, vous y créerez un fichier « UserController.java ». 
Dans le fichier vous devrez déclarer la classe « UserController » en utilisant l'annotation « @RestController ».

Dans cette classe, déclarez une variable privée « userService » de type « UserService » et ajoutez un constructeur pour l'injecter :

public UserController(UserService userService) {
 this.userService = userService;
}

Utilisez l'annotation « @GetMapping("/user") » pour spécifier l'URL de l'endpoint de l'API.
Définissez une méthode « getUser » qui prend un paramètre « id » annoté avec 
« @RequestParam ». Cette méthode est appelée lorsqu'une requête GET est effectuée sur 
l'URL « /user ».
À l'intérieur de cette méthode, appelez la méthode « getUser » du « userService » pour 
récupérer un objet User correspondant à l'« id » donné.
Vérifiez si l'utilisateur existe et renvoyez-le. Sinon, renvoyez « null ».
5/5
*/ 

// ANNOTATION
@RestController
//CLASSE
public class UserController {
    //ATTRIBUT
    private UserService userService;
    
//CONSTRUCTEUR
public UserController(UserService userService) {
 this.userService = userService;
}
//ANNOTATION
@GetMapping("/user")

public User getUser(@RequestParam int id){
    User user = userService.getUser(id);

return user;
}
}

/*METHODE getUser
    public User getUser(int id) { // VALEUR DE RETOUR  de la méthode ou de la fonction getUser()
        for (User user : users) { //je vais créer une nouvelle variable user avec le type User qui va parcourir le tableau users 
            if (user.getId()== id) { // SI L'identifiant de user et celui en parametre (int id) sont egaux alors c'est celui qui est recherché donc il faut la retourner (recuperer) à l 'exterieur de la fonction
                return user;
            }
        }*/ 
 





