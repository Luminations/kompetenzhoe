package com.company;

/**
 * a supposed to represent wild animals
 */
public abstract class Animal {
    public int power;
    public int health;
    public int regenerationRate;
    public String name;

    /**
     * sets variable to custom variables according to animal statistics
     */
    public Animal(){
       health = 0;
       regenerationRate = 0;
        name = "default name";
    }

    /**
     * suptracts health from the animal acording to this's power
     * @param animal ataccked animal witch lives goes down
     */
    public void Fight(Animal animal){
            animal.health = animal.health - this.power;
    }

    /**
     * increeses the health of this animal by its regenerationRate
     */
    public void Regenerate(){
        health = health + regenerationRate;
    }

}
