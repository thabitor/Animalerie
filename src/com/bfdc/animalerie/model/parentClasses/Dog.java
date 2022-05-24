package com.bfdc.animalerie.model.parentClasses;

import com.bfdc.animalerie.model.enums.DogCollerColor;
import com.bfdc.animalerie.model.enums.DogRace;
import com.bfdc.animalerie.model.enums.Gender;

import java.time.LocalDate;

public class Dog extends Animal {

    private DogCollerColor collerColor;
    private DogRace dogRace;
    private Boolean educated;

    private static int instanceCounter = 0;


    public Dog(String nom, Double weight, Gender gender, Double age, Double humanAge, LocalDate arrivalInShelter, DogCollerColor collerColor, DogRace dogRace, Boolean educated) {
        super(nom, weight, gender, age, humanAge, arrivalInShelter);
        this.collerColor = collerColor;
        this.dogRace = dogRace;
        this.educated = educated;
        this.setDeathProbability(1.0);
        instanceCounter++;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }

    public DogCollerColor getCollerColor() {
        return collerColor;
    }

    public DogRace getDogRace() {
        return dogRace;
    }

    public Boolean getEducated() {
        return educated;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof woof!\n");
    }

    @Override
    public void showDetails() {

        String femaleEdu = " is educated and her coller color is ";
        String femaleNonEdu = " is not educated and her coller color is ";
        String maleEdu = " is educated and his coller color is ";
        String maleNonEdu = " is not educated and his coller color is ";

        super.showDetails();
        if (getGender() == Gender.Female && getEducated()) {
            System.out.println("As a dog, " + getNom() + " is a " + getDogRace() + ". " + getNom() + femaleEdu + getCollerColor());
        } else if (getGender() == Gender.Male && getEducated()) {
            System.out.println("As a dog, " + getNom() + " is a " + getDogRace() + ". " + getNom() + maleEdu + getCollerColor());
        } else if (getGender() == Gender.Female && !getEducated()) {
            System.out.println("As a dog, " + getNom() + " is a " + getDogRace() + ". " + getNom() + femaleNonEdu + getCollerColor());
        } else if (getGender() == Gender.Male && !getEducated()) {
            System.out.println("As a dog, " + getNom() + " is a " + getDogRace() + ". " + getNom() + maleNonEdu + getCollerColor());
        }
        makeSound();
    }
}
