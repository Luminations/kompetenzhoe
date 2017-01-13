package com.company;


public abstract class Animal {
    public int power;
    public int population;
    public int procreationPower;

    public Animal(){
       population = 0;
       procreationPower = 0;
    }

    public void fight(Animal animal){
        if (animal.population < 0){
            if (this.power > animal.power){
                this.die();
            }
            else if (this.power < animal.power){
                animal.die();
            }
            else {
                animal.die();
                this.die();
            }
        }
    }
	
    public void die(){
        this.population --;
    }
    public void procreate(){
        population = population + procreationPower;
    }


    public int getPopulation() {
        return population;
    }


}
