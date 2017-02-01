package com.company;

import com.company.Cyborgs.Reptiles.Reptile;
import com.company.Mamals.Mammal;

import java.util.ArrayList;

/**
 * a fightclub were animals can fight in various ways
 */
public class FightClub {
    /**
     * every animal fights every animal or exterminates if oponent is not a reptile
     * @param animals the arraylist of all the animals wich will fight
     */
    public void FightclubNight(ArrayList<Animal> animals){
        ArrayList<Animal> tempAnimals = animals;
        for (int i = 0; i< tempAnimals.size(); i++){
            for (int j = 0; j < tempAnimals.size(); j++){
                if (i != j){
                    if (Reptile.class.isAssignableFrom(tempAnimals.get(i).getClass())){
                        Reptile reptile = (Reptile) tempAnimals.get(i);
                        reptile.exterminate(tempAnimals.get(j));
                        System.out.println(tempAnimals.get(j).name + " now has " + tempAnimals.get(j).health +  " health");
                    }else {
                        tempAnimals.get(i).Fight(tempAnimals.get(j));
                        System.out.println(tempAnimals.get(j).name + " now has " + tempAnimals.get(j).health + " health");
                    }
                }
            }
        }
    }

    /**
     * all mamals in the arraylist fight each other
     * @param animals all the animals wich fight
     */
    public void MamalFighting(ArrayList<Animal> animals){

        for (int i = 0;i<animals.size(); i++){
            for (int j = 0; j<animals.size();j++){
                if (i != j && Mammal.class.isAssignableFrom(animals.get(i).getClass()) && Mammal.class.isAssignableFrom(animals.get(j).getClass())){
                    animals.get(i).Fight(animals.get(j));
                    System.out.println(animals.get(j).name + " now has " + animals.get(j).health + " health");
                }
            }
        }
    }

    /**
     * all reptiles in the arraylist fight each other
     * @param animals all the animals wich fight
     */
    public void ReptileFighting(ArrayList<Animal> animals){
        for (int i = 0;i<animals.size(); i++){
            for (int j = 0; j<animals.size();j++){
                if (i != j && Reptile.class.isAssignableFrom(animals.get(i).getClass()) && Reptile.class.isAssignableFrom(animals.get(j).getClass())){
                    animals.get(i).Fight(animals.get(j));
                    System.out.println(animals.get(j).name + " now has " + animals.get(j).health + " health");
                }
            }
        }
    }
}
