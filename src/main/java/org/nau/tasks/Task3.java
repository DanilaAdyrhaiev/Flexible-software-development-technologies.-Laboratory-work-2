package org.nau.tasks;

import org.nau.abstractEbtities.Animal;
import org.nau.entities.Cat;
import org.nau.entities.Dog;
import org.nau.entities.Wolf;
import org.nau.services.AnimalService;

public class Task3 {
    public static void main(String[] args) {
        AnimalService service = new AnimalService();
        service.add(new Dog());
        service.add(new Cat());
        service.add(new Wolf());

        for(Animal animal : service.listAll()){
            animal.makeSound();
            animal.eat();
            animal.move();
        }
    }
}
