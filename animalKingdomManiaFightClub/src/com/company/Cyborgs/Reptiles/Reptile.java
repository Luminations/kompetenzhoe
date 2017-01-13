package com.company.Cyborgs.Reptiles;


import com.company.Animal;
import com.company.Cyborgs.Cyborg;

public abstract class Reptile extends Animal implements Cyborg {

    public Reptile(){
    }

    @Override
    public void exterminate(Animal animal) {
        if (!animal.getClass().isAssignableFrom(Cyborg.class)){
            animal.population = 0;
        }else {
            super.fight(animal);
        }
    }
}
