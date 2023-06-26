package fr.dolleans.myApi.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.dolleans.myApi.model.Animal;
import fr.dolleans.myApi.service.AnimalService;
/*Dans le fichier AnimalController.java, nous avons ajouté les méthodes GET, POST, PUT et DELETE pour la gestion des animaux.
 Les types de retour de ces méthodes ont été modifiés pour utiliser ResponseEntity<Animal> afin de pouvoir spécifier les codes de réponse HTTP appropriés. 
 Les codes de réponse tels que 200 OK, 201 Created, 204 No Content et 404 Not Found sont utilisés en fonction du résultat de l'opération. */

// ANNOTATION
@RestController
//CLASSE
public class AnimalController<animal> {
    //ATTRIBUT
    private AnimalService animalService;
    
//CONSTRUCTEUR
public AnimalController(AnimalService animalService) {
 this.animalService = animalService;
}
//ANNOTATION
@GetMapping("/animals")
public ArrayList<Animal> getAllAnimal(){
    return animalService.getAllAnimal();
}
@GetMapping("/animal")
// METHODE getAnimal
public ResponseEntity<Animal> getAnimal(@RequestParam int id){
    Animal animal = animalService.getAnimal(id);
    if (animal!=null){
        return ResponseEntity.ok(animal);    
    } else {
        return ResponseEntity.notFound().build();
    }
}

 
 @PostMapping("/animal")
public ResponseEntity<Animal> createAnimal(@RequestBody AnimalRequest body){
Animal animal = animalService.createAnimal(body.getName(),body.getType(),body.getWeight());
return ResponseEntity.status(HttpStatus.CREATED) .body(animal);
}

private ResponseEntity<Animal> ResponseEntity(Animal animal) {
    return null;
}
@PutMapping("/animal")
public ResponseEntity<Animal> updateAnimal(@RequestParam int id,@RequestBody AnimalRequest body){
Animal animal = animalService.updateAnimal(id,body.getName(),body.getType(),body.getWeight());
   if (animal!=null){
        return ResponseEntity.ok(animal);    
    } else {
        return ResponseEntity.notFound().build();
    }
}
@DeleteMapping("/animal")
public ResponseEntity<Void> deleteAnimal(@RequestParam int id){
    Animal animal =animalService.deleteAnimal(id);
      if (animal!=null){
        return ResponseEntity.noContent().build();    
    } else {
        return ResponseEntity.notFound().build();
    }
} 
}


   
