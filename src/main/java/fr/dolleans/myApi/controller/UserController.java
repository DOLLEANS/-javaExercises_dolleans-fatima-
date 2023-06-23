package fr.dolleans.myApi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
/* */

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
// METHODE getUser
public User getUser(@RequestParam int id){
    User user = userService.getUser(id);

return user;
}
/*EXERCICE2 Toujours dans le dossier « controller » de « myApi », allez dans le fichier 
« UserController.java ». Vous allez devoir y ajouter une méthode publique « createUser » qui 
prendra en paramètre un « body » de type « UserRequest » avec l’annotation 
« @RequestBody ».
Cette méthode devra être précédée de l'annotation « @PostMapping("/user") » pour spécifier 
l'URL de l'endpoint de l'API. De cette manière, ce sera cette méthode qui sera appelée 
lorsqu'une requête POST sera effectuée sur l'URL « /user ».
À l'intérieur de cette méthode, appelez la méthode « createUser » du « userService », avec les 
paramètres de « body » que vous récupérez avec les « getters ». Les paramètres devront être 
les variables « name » et « age ». Vous récupérerez un objet de type « User » que vous 
retournerez.
 @PostMapping("/user")
public User createUser(@RequestBody UserRequest body){()
User user = userService.createUser(body.getName(),body.getAge());

return user;
}*/
//AUTRES VERSION DE PRESENTATION DE createUser plus compréhensive pour debutant mais prends plus de place

/* @PostMapping("/user")
public User createUser(@RequestBody UserRequest body){
    String name= body.getName();
    int age = body.getAge();
User user = userService.createUser(name,age);
return user;
} */
 
 @PostMapping("/user")
public User createUser(@RequestBody UserRequest body){
User user = userService.createUser(body.getName(),body.getAge());
return user;
}
/*EXERCICE 3
Dans le dossier « controller » de « myApi », allez dans le fichier « UserController.java ». Vous allez devoir y ajouter une méthode publique 
« updateUser » qui prendra en paramètre : 
-	Une variable « id » de type « Integer » avec l’annotation « @RequestParam ».
-	Une variable « body » de type « UserRequest » avec l’annotation « @RequestBody ».

Cette méthode devra être précédée de l'annotation « @PutMapping("/user") » pour spécifier l'URL de l'endpoint de l'API. 
De cette manière, ce sera cette méthode qui sera appelée lorsqu'une requête PUT sera effectuée sur l'URL « /user ».
À l'intérieur de cette méthode, appelez la méthode « updateUser » du « userService »,
 avec les paramètres « id » et ceux de « body » que vous récupérez avec les « getters ». 
 Vous récupérerez un objet de type « User » que vous retournerez.
 */
@PutMapping("/user")
public User updateUser(@RequestParam int id,@RequestBody UserRequest body){
User user = userService.updateUser(id,body.getName(),body.getAge());
return user;
}
@DeleteMapping("/user")
public User deleteUser(@RequestParam int id){
    User user =userService.deleteUser(id);
    return user;

}
/*EXERCICE 4 
 * Dans le dossier « controller » de « myApi », allez dans le fichier « UserController.java ». Vous 
allez devoir y ajouter une méthode publique « deleteUser » qui prendra en paramètre une 
variable « id » de type « Integer » avec l’annotation « @RequestParam ».
Cette méthode devra être précédée de l'annotation « @DeleteMapping("/user") » pour spécifier 
l'URL de l'endpoint de l'API. De cette manière, ce sera cette méthode qui sera appelée 
lorsqu'une requête PUT sera effectuée sur l'URL « /user ».
À l'intérieur de cette méthode, appelez la méthode « deleteUser » du « userService », Le 
paramètre devra être la variable « id ». Vous récupérerez un objet de type « User » que vous 
retournerez
 */
}







/*METHODE getUser
    public User getUser(int id) { // VALEUR DE RETOUR  de la méthode ou de la fonction getUser()
        for (User user : users) { //je vais créer une nouvelle variable user avec le type User qui va parcourir le tableau users 
            if (user.getId()== id) { // SI L'identifiant de user et celui en parametre (int id) sont egaux alors c'est celui qui est recherché donc il faut la retourner (recuperer) à l 'exterieur de la fonction
                return user;
            }
        }*/ 
 





