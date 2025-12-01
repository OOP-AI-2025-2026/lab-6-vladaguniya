package org.example;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Джек");
        Cat myCat = new Cat("Кузя");

        System.out.println(myDog.getName() + " каже: " + myDog.makeSound());
        System.out.println(myCat.getName() + " каже: " + myCat.makeSound());

        System.out.println("--- Перевірка поліморфізму ---");

        Animal[] pets = {
                new Dog("Барбос"),
                new Cat("Нора")
        };

        for (Animal pet : pets) {
            System.out.println(pet.getName() + " каже: " + pet.makeSound());
        }
    }
}
