package com.company;


public abstract class Animal {
    public int power;
    public int health;
    public int regenerationRate;
    public String name;

    public Animal(){
       health = 0;
       regenerationRate = 0;
        name = "default name";
    }

    public void Fight(Animal animal){
        if (animal.health > 0){

            animal.health = animal.health - this.power;
        }
    }
	
    public void Regenerate(){
        health = health + regenerationRate;
    }

}
