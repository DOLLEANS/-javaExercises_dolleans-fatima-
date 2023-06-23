package fr.dolleans.myApi.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.dolleans.myApi.model.Animal;


@Service
public class AnimalService {

    private ArrayList<Animal> animals; 
   
public AnimalService(){
  this.animals = new ArrayList<Animal>(); 

  this.animals.add(new Animal(0,"LION","MAMMIFERE",100));
  this.animals.add(new Animal(1,"SINGE","MAMMIFERE",50));
  this.animals.add(new Animal(2,"PIGEON","OISEAU",10)); 
  this.animals.add(new Animal(3,"DAUPHIN","POISSON",70));
  this.animals.add(new Animal(4,"SERPENT","REPTLIE",15)); 
}

    public Animal getAnimal(int id) { 
        for (Animal animal : this.animals) { 
            if (animal.getId()== id) { 
                return animal;
            }
        }
        return null;
     
    }

    public Animal createAnimal(String name,String type, int weight){
        Animal animal =new Animal(animals.size()+1,name,type,weight);
        return animal;
    }
    
public Animal updateAnimal(int id,String name,String type,int weight){
    for(Animal animal:this.animals){
        if(animal.getId() ==id){
             animal.setName(name);
             animal.setType(type);
             animal.setWeight(weight);
             return animal;
        }
    }
return null;
}

public Animal deleteUser(int id){
    for(Animal animal:this.animals){
        if(animal.getId()==id){
            int index =this.animals.indexOf(animal); 
            Animal deleteAnimal =this.animals.remove(index);    
  return deleteAnimal;
        }  
    }

return null;

}

public Animal createAnimal(String name, int weight) {
    return null;
}

public Animal updateAnimal(int id, String name, int age) {
    return null;
}

public Animal deleteAnimal(int id) {
    return null;
}

}
