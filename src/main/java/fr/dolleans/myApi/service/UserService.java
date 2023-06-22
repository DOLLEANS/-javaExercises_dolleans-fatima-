package fr.dolleans.myApi.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import fr.dolleans.myApi.model.User;
/*
 * Vous allez créer un dossier « service » dans votre dossier « myApi », ce qui donnera un package « com.example.myApi.service ». 
 * Ce package permettra de communiquer les données aux routes de l’API et inversement.
 * 
 *  Dans ce dossier, vous y créerez un fichier « UserService.java ». 
 * 
 * Dans ce fichier, vous devrez déclarer la classe «UserService » précédée d’une annotation « @Service ».
 * 
 * Dans cette classe, déclarez une variable d'instance « users » qui est une liste d'objets User,« ArrayList<User> ».
 *  Ajoutez un constructeur qui initialise la liste « users» avec 3 utilisateurs de test de votre choix.
 * 
 * Déclarez une méthode « getUser » prenant un paramètre « id » pour rechercher un utilisateur par son ID.
 *  À l'intérieur de la méthode, parcourez la liste « users » et comparez les IDs pour trouver l'utilisateur correspondant. 
 * Si un utilisateur est trouvé, retournez cet utilisateur. Sinon,retournez « null »
 */

//ANNOTATION
@Service
//CLASSE
public class UserService {
//ATTRIBUTS
    private ArrayList<User> users; //  les utilisateurs users sont de type List

 //CONSTRUCTEUR
//public UserService (ArrayList<User> users) {
   // this.users = users;
    //}
// CONSTRUCTEUR PAR DEFAUT
public UserService(){
  this.users = new ArrayList<User>(); 
  
 // CREATION D'INSTANCE QUI INITIALISE LA LISTE "users" AVEC 3 utilisateurs de test de votre choix

  this.users.add(new User(0,"FATIMA",35));
  this.users.add(new User(1,"AMEL",25));
  this.users.add(new User(2,"YOSR",15)); 
}
// METHODE getUser
    public User getUser(int id) { // VALEUR DE RETOUR  de la méthode ou de la fonction getUser()
        for (User user : this.users) { //je vais créer une nouvelle variable user avec le type User qui va parcourir le tableau users (this.users)
            if (user.getId()== id) { // SI L'identifiant de user et celui en parametre (int id) sont egaux alors c'est celui qui est recherché donc il faut la retourner (recuperer) à l 'exterieur de la fonction
                return user;
            }
        }
        return null;// UNE FOIS FINI PAR DEFAUT RENVOIE NULL S'IL NYA PLUS RIEN
     
    }

}
 



