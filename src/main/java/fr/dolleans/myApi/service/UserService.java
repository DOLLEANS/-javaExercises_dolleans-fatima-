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
  this.users.add(new User(2,"CAMILLE",15)); 
  this.users.add(new User(3,"PAUL",45));
  this.users.add(new User(4,"PASCAL",55)); 
}
// METHODE getUser
    public User getUser(int id) { // VALEUR DE RETOUR  de la méthode ou de la fonction getUser()
        for (User user : this.users) { //je vais créer une nouvelle variable user avec le type User qui va parcourir le tableau users (this.users)
            if (user.getId()== id) { // SI L'identifiant de user et celui en parametre (int id) sont egaux alors c'est celui qui est recherché donc il faut la retourner (recuperer et le remettre) à l 'exterieur de la fonction
                return user;
            }
        }
        return null;// UNE FOIS FINI PAR DEFAUT RENVOIE NULL S'IL NYA PLUS RIEN
     
    }

    public User createUser(String name,int age){
        User user =new User(users.size()+1,name,age);
        return user;

    }
public User updateUser(int id,String name,int age){
    for(User user:this.users){
        if(user.getId() ==id){
             user.setName(name);
             user.setAge(age);
    return user;
        }
    }
return null;
}
}
 /* EXERCICE3 Rendez-vous dans le dossier « service » à l’intérieur de « myApi ». 
 Dans le fichier « UserService.java », vous devrez ajouter une méthode publique à la classe
  « UserService » qui sera nommée « updateUser » prenant en paramètre un « id » le « name » et l’« age ».
Elle devra retourner un « User ».
Dans cette méthode, vous devrez parcourir le tableau « users » et vérifier quand les « id » seront les mêmes.
 Dès que la condition sera vraie, c’est-à-dire que l’« id » de votre paramètre et l’« id » de l’« user » seront
  identiques, vous pourrez modifier les valeurs « name » et « age » avec les « setters » approprié.
 Vous retournerez ensuite un « user » modifié. Si vous ne trouvez pas l’« id » dans la liste « users » 
 vous retournerez « null ».
 */

