package com.company.Cyborgs.Reptiles;


import com.company.Animal;
import com.company.Cyborgs.Cyborg;

public abstract class Reptile extends Animal implements Cyborg {

    public Reptile(){
    }

    @Override
    public void exterminate(Animal animal) {


        if (!Reptile.class.isAssignableFrom(animal.getClass())){
            animal.health = 0;
        }else {
            super.Fight(animal);
        }
    }
}
