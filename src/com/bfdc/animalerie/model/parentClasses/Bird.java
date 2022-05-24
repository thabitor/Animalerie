package com.bfdc.animalerie.model.parentClasses;

import com.bfdc.animalerie.model.enums.BirdColors;
import com.bfdc.animalerie.model.enums.BirdHome;
import com.bfdc.animalerie.model.enums.Gender;

import java.time.LocalDate;

public class Bird extends Animal {

    private BirdColors birdColor;
    private BirdHome birdHome;

    private static int instanceCounter = 0;

    public Bird(String nom, Double weight, Gender gender, Double age, Double humanAge, LocalDate arrivalInShelter, BirdColors birdColor, BirdHome birdHome) {
        super(nom, weight, gender, age, humanAge, arrivalInShelter);
        this.birdColor = birdColor;
        this.birdHome = birdHome;
        this.setDeathProbability(3.0);
        instanceCounter++;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }

    public BirdColors getBirdColor() {
        return birdColor;
    }

    public BirdHome getBirdHome() {
        return birdHome;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Hoot hoot!\n");
    }

    @Override
    public void showDetails() {
        super.showDetails();
        if (getGender() == Gender.Female) {
            System.out.println("As a bird " + getNom() + " is a beautiful " + getBirdColor() + " color, and she likes to live in a " + getBirdHome());
        } else {
            System.out.println("As a bird " + getNom() + " is a beautiful " + getBirdColor() + " color, and he likes to live in a " + getBirdHome());
        }
        makeSound();
    }
}
