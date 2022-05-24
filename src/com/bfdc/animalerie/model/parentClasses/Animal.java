package com.bfdc.animalerie.model.parentClasses;

import com.bfdc.animalerie.model.enums.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Animal {

    private String nom;
    private Double weight;
    private Gender gender;
    private Double age;
    private Double humanAge;
    private LocalDate arrivalInShelter;

    private Double deathProbability;



    public Animal(String nom, Double weight, Gender gender, Double age, Double humanAge, LocalDate arrivalInShelter) {
        this.nom = nom;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.humanAge = humanAge;
        this.arrivalInShelter = arrivalInShelter;
        this.deathProbability = getDeathProbability();
    }

    public String getNom() {
        return nom;
    }

    public Double getWeight() {
        return weight;
    }

    public Gender getGender() {
        return gender;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(Double humanAge) {
        this.humanAge = humanAge;
    }

    public LocalDate getArrivalInShelter() {
        return arrivalInShelter;
    }

    public Double getDeathProbability() {
        return deathProbability;
    }

    public void setDeathProbability(Double deathProbability) {
        this.deathProbability = deathProbability;
    }

    public void makeSound() {
        System.out.println(getNom() + " makes the sound: ");
    }

    public boolean PasserLaNuit() {
        boolean dead = false;
        double temp;
        Random rand = new Random();
        temp = rand.nextDouble(deathProbability, 100);
        if (temp <= deathProbability) {
            dead = true;
        } return dead;
    }

    public void showDetails() {

        if (getGender() == Gender.Female) {
            System.out.println(
                    getNom() + " is " + getAge() + " years old, or " + getHumanAge() + " years in human years. \n" +
                            getNom() + " is " + getGender() + ". She arrived in our shelter on " + getArrivalInShelter() +
                            ". Today she weighs " + getWeight() + " Kgs.");
        } else {
            System.out.println(
                    getNom() + " is " + getAge() + " years old, or " + getHumanAge() + " years in human years. \n" +
                            getNom() + " is " + getGender() + ". He arrived in our shelter on " + getArrivalInShelter() +
                            ". Today he weighs " + getWeight() + " Kgs.");
        }
    }
}

