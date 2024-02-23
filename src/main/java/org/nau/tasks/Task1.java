package org.nau.tasks;

import org.nau.abstractEbtities.Animal;
import org.nau.entities.Dog;
import org.nau.services.AnimalService;

public class Task1 {
    public static void main(String[] args) {
        AnimalService service = new AnimalService();
        //Створіть другий клас, наприклад, Main, в якому створіть три екземпляри класу Class.
        service.add(new Dog("Robby"));
        service.add(new Dog("Elly", 3, Animal.Gender.FEMALE));
        service.add(new Dog("Lord", 2));

        //Виведіть на консоль значення їх полів.
        service.displayAllAnimals();

        Animal dog = service.getByParam(1);
        dog.setPersonality(Animal.Personality.FRIENDLY);
        service.update(dog);

        dog = service.getByParam("Robby");
        dog.setPersonality(Animal.Personality.PLAYFUL);
        service.update(dog);

        dog = service.add(new Dog());
        dog.setId(10);
        dog.setName("Luffy");
        dog.setAge(5);
        dog.setGender(Animal.Gender.MALE);
        dog.setPersonality(Animal.Personality.PLAYFUL);

        System.out.println(dog.getId());
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getGender());
        System.out.println(dog.getPersonality());

    }

}
