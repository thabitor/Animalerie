package com.bfdc.animalerie;
import com.bfdc.animalerie.model.enums.*;
import com.bfdc.animalerie.model.parentClasses.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public Dog d1;
    public Dog d2;
    public Dog d3;
    public Cat c1;
    public Cat c2;
    public Cat c3;

    public Bird b1;
    public Bird b2;
    public Bird b3;



    public static void main(String[] args) {

        // Dogs
        Dog d1 = new Dog("Cleo", 23.5, Gender.Female, 3.0, 28.0,
                LocalDate.of(2021, 05, 13), DogCollerColor.Red, DogRace.BRUSSELS_GRIFFON, true);

        Dog d2 = new Dog("Cooper", 22.5, Gender.Male, 2.0, 24.0,
                LocalDate.of(2022, 3, 19), DogCollerColor.Blue, DogRace.PEKINGESE, true);

        Dog d3 = new Dog("Bella", 17.5, Gender.Female, 1.0, 15.0,
                LocalDate.of(2021, 11, 13), DogCollerColor.White, DogRace.AMERICAN_HAIRLESS, false);

        // Cats

        Cat c1 = new Cat("Loki", 15.5, Gender.Male, 1.0, 15.0,
                LocalDate.of(2022, 1, 15), CatCharacters.Warm, false, true);

        Cat c2 = new Cat("Milo", 12.5, Gender.Female, 2.0, 15.0,
                LocalDate.of(2021, 9, 5), CatCharacters.Energetic, true, true);

        Cat c3 = new Cat("Willow", 13.0, Gender.Male, 3.0, 15.0,
                LocalDate.of(2021, 3, 22), CatCharacters.Wild, false, false);

        // Birds

        Bird b1 = new Bird("Bubba", 3.0, Gender.Female, 2.0, 18.0,
                LocalDate.of(2020, 10, 12), BirdColors.Blue, BirdHome.Aviary);

        Bird b2 = new Bird("Plucky", 3.0, Gender.Male, 1.0, 9.0,
                LocalDate.of(2022, 3, 6), BirdColors.Buff, BirdHome.Aviary);

        Bird b3 = new Bird("Zazu", 3.0, Gender.Male, 3.0, 27.0,
                LocalDate.of(2021, 6, 1), BirdColors.Iridescence, BirdHome.Cage);

    }


    public void ShowAllAnimals() {
        System.out.println("We currently have " + Bird.getInstanceCounter() + " birds, "
                + Dog.getInstanceCounter() + " dogs, and "
                + Cat.getInstanceCounter() +
                ". Read more about them below:\n");
        d2.showDetails();
        b2.showDetails();
        c3.showDetails();
        d1.showDetails();
        b1.showDetails();
        c1.showDetails();
        b3.showDetails();
        d3.showDetails();
        c2.showDetails();
    }

    public void ShowAllDogs() {
        d2.showDetails();
        d1.showDetails();
        d3.showDetails();
    }

    public void ShowAllCats() {
        c2.showDetails();
        c1.showDetails();
        c3.showDetails();
    }

    public void ShowAllBirds() {
        b2.showDetails();
        b1.showDetails();
        b3.showDetails();
    }




}
