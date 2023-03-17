package com.designpattern.www;

public class Main {

    public static void main(String[] args) {
	AnimalFactory animalFactory = new AnimalFactory();

	Animal animal1 = animalFactory.getAnimal("Dog");
	animal1.eat();

	Animal animal2 = animalFactory.getAnimal("Cat");
    animal2.eat();

    Animal animal3 = animalFactory.getAnimal("Rabbit");
    animal3.eat();

    }
}
