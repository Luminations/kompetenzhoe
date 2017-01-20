package com.company;

import com.company.Cyborgs.Reptiles.Crocodile;
import com.company.Cyborgs.Reptiles.Iguana;
import com.company.Cyborgs.Reptiles.Reptile;
import com.company.Mamals.Lion;
import com.company.Mamals.RedPanda;

import java.util.ArrayList;

public class AnimalKingdom {


    public static void main(String[] args) {

        FightClub fightClub = new FightClub();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Crocodile());
        animals.add(new Lion());
        animals.add(new RedPanda());
        animals.add(new Iguana());

        fightClub.FightclubNight(animals);


















    }


}
