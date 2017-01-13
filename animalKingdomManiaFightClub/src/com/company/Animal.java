package com.company;


public class Animal {
    private int power;
    private int population;
    private int procreationPower;

    public Animal(){
       setPopulation(0);
       setProcreationPower(5);
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getProcreationPower() {
        return procreationPower;
    }

    public void setProcreationPower(int procreationPower) {
        this.procreationPower = procreationPower;
    }
}
