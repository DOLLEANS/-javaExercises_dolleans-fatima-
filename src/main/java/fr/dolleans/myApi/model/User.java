
package fr.dolleans.myApi.model;

/*- Une variable de type « Integer » nommée « id ».
- Une variable de type « String » nommée « name ».
- Une variable de type « Integer » nommée « age ».
Vous devrez également y placer le constructeur prenant en paramètre les variables « id », 
« name » et « age » pour initialiser les variables d'instance de la classe.
Vous déclarerez les méthodes « getters » et « setters » pour les variables d'instance « name »,
« age » et uniquement le « getter » pour l’« id ».*/ 

// CLASSE
public class User {
// ATTRIBUT
 private int id;
 private String name;
 private int age;
//CONSTRUCTEUR
public User(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
}
//METHODE GETTER SETTER

public int getId() {
    return id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}
}




