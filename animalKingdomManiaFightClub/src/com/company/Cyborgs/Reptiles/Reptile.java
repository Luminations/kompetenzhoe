package com.company.Cyborgs.Reptiles;


import com.company.Animal;
import com.company.Cyborgs.Cyborg;

/**
 * A type of animal witch implements and Cyborg and can exterminate
 */
public abstract class Reptile extends Animal implements Cyborg {

    public Reptile(){
    }

    /**
     * if the animal is a Reptile it simply fights. if not it sets the animals health to 0
     * @param animal the animal to be exterminated
     */
    @Override
    public void exterminate(Animal animal) {


        if (!Reptile.class.isAssignableFrom(animal.getClass())){
            animal.health = 0;
        }else {
            super.Fight(animal);
        }
    }
}
