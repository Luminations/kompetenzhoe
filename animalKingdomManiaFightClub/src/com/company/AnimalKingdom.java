package com.company;

import com.company.Cyborgs.Reptiles.Crocodile;
import com.company.Mamals.Lion;

public class AnimalKingdom {


    public static void main(String[] args) {


        Crocodile crocodile = new Crocodile();
        Lion lion = new Lion();

        System.out.println(lion.getPopulation());
        crocodile.exterminate(lion);
        System.out.println(lion.getPopulation());
    }
}
