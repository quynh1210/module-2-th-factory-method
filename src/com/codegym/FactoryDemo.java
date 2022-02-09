package com.codegym;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFacory();

        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sound: ");
    }
}
