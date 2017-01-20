package com.company;


public abstract class Animal {
    public int power;
    public int population;
    public int procreationPower;
    public String name;

    public Animal(){
       population = 0;
       procreationPower = 0;
        name = "default name";
    }

    public void fight(Animal animal){
        if (animal.population > 0){

            animal.population = animal.population - this.power * this.population;
        }
    }
	
    public void procreate(){
        population = population + (procreationPower * (population));
    }


    public int getPopulation() {
        return population;
    }


}
