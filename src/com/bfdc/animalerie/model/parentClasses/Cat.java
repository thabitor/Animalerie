package com.bfdc.animalerie.model.parentClasses;

import com.bfdc.animalerie.model.enums.CatCharacters;
import com.bfdc.animalerie.model.enums.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cat extends Animal {

    private CatCharacters character;
    private Boolean clawsCut;
    private Boolean longHair;

    private static int instanceCounter = 0;


    public Cat(String nom, Double weight, Gender gender, Double age, Double humanAge, LocalDate arrivalInShelter, CatCharacters character, Boolean clawsCut, Boolean longHair) {
        super(nom, weight, gender, age, humanAge, arrivalInShelter);
        this.character = character;
        this.clawsCut = clawsCut;
        this.longHair = longHair;
        this.setDeathProbability(0.5);
        instanceCounter++;

    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }

    public CatCharacters getCharacter() {
        return character;
    }

    public Boolean getClawsCut() {
        return clawsCut;
    }

    public Boolean getLongHair() {
        return longHair;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow!\n");
    }

    public boolean PasserLaNuit() {
        return super.PasserLaNuit();
    }

    public void showDetails() {
        super.showDetails();
        if (getGender() == Gender.Female && getClawsCut() && getLongHair()) {
            System.out.println("As a cat " + getNom() + " is " + getCharacter() + ", her claws have been trimmed and she is fluffy.");

        } else if (getGender() == Gender.Male && getClawsCut() && getLongHair()) {
            System.out.println("As a cat " + getNom() + " is " + getCharacter() + ", his claws have been trimmed and he is fluffy.");

        } else if (getGender() == Gender.Female && !getClawsCut() && getLongHair()) {
            System.out.println("As a cat " + getNom() + " is " + getCharacter() + ", her claws are long and she is fluffy.");

        } else if (getGender() == Gender.Male && !getClawsCut() && getLongHair()) {
            System.out.println("As a cat " + getNom() + " is " + getCharacter() + ", his claws are long and he is fluffy.");

        } else if (getGender() == Gender.Female && getClawsCut() && !getLongHair()) {
            System.out.println("As a cat " + getNom() + " is " + getCharacter() + ", her claws have been trimmed and her hair thin.");

        } else if (getGender() == Gender.Male && getClawsCut() && !getLongHair()) {
            System.out.println("As a cat " + getNom() + " is " + getCharacter() + ", his claws have been trimmed and his hair thin.");

        } else if (getGender() == Gender.Female && !getClawsCut() && !getLongHair()) {
            System.out.println("As a cat " + getNom() + " is " + getCharacter() + ", her claws are long and her hair thin.");

        } else if (getGender() == Gender.Male && !getClawsCut() && !getLongHair()) {
            System.out.println("As a cat " + getNom() + " is " + getCharacter() + ", his claws are long and his hair thin.");
        }
        makeSound();
    }
}
