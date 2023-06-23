package fr.dolleans.myApi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.dolleans.myApi.model.Animal;
import fr.dolleans.myApi.service.AnimalService;

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
// METHODE getAnimal
public Animal getAnimal(@RequestParam int id){
    Animal animal = animalService.getAnimal(id);

return animal;
}

 
 @PostMapping("/animals")
public Animal createUser(@RequestBody AnimalRequest body){
Animal animal = animalService.createAnimal(body.getName(),body.getType(),body.getWeight());
return animal;
}

@PutMapping("/animals")
public Animal updateAnimal(@RequestParam int id,@RequestBody AnimalRequest body){
Animal animal = animalService.updateAnimal(id,body.getName(),body.getType(),body.getWeight());
return animal;
}
@DeleteMapping("/animals")
public Animal deleteAnimal(@RequestParam int id){
    Animal animal =animalService.deleteAnimal(id);
    return animal;

}
}

    
