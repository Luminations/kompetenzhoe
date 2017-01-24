package com.company;

import com.company.Cyborgs.Reptiles.Reptile;
import com.company.Mamals.Mammal;

import java.util.ArrayList;

/**
 * Created by fraser on 1/20/17.
 */
public class FightClub {

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

    public void MamalFighting(ArrayList<Animal> animals){
        ArrayList<Animal> tempMamalsAnimals = new ArrayList<>();
        for(int i = 0; i< animals.size();i++){
            if (Mammal.class.isAssignableFrom(animals.get(i).getClass())){
                tempMamalsAnimals.add(animals.get(i));
            }
        }

        for (int i = 0;i<tempMamalsAnimals.size(); i++){
            for (int j = 0; j<tempMamalsAnimals.size();j++){
                if (i != j){
                    tempMamalsAnimals.get(i).Fight(animals.get(j));
                    System.out.println(tempMamalsAnimals.get(j).name + "now has" + tempMamalsAnimals.get(j).health + "health");
                }
            }
        }
    }

    public void ReptileFighting(ArrayList<Animal> animals){
        ArrayList<Animal> tempReptilesAnimals = new ArrayList<>();
        for(int i = 0; i< animals.size();i++){
            if (Reptile.class.isAssignableFrom(animals.get(i).getClass())){
                tempReptilesAnimals.add(animals.get(i));
            }
        }

        for (int i = 0;i<tempReptilesAnimals.size(); i++){
            for (int j = 0; j<tempReptilesAnimals.size();j++){
                if (i != j){
                    tempReptilesAnimals.get(i).Fight(animals.get(j));
                    System.out.println(tempReptilesAnimals.get(j).name + "now has" + tempReptilesAnimals.get(j).health + "health");
                }
            }
        }
    }
}
