package com.company;

import com.company.Cyborgs.Reptiles.Reptile;

import java.util.ArrayList;

/**
 * Created by fraser on 1/20/17.
 */
public class FightClub {

    public void FightclubNight(ArrayList<Animal> animals){
        int aliveanimals = 0;

        for (int n = 0; n< animals.size() ; n++){
            animals.get(n).procreate();
        }

        for (int i = 0; i < animals.size(); i ++){
            if (animals.get(i).population > 0){
                aliveanimals ++;
            }
        }
        while (aliveanimals > 1){
            for (int i = 0; i < animals.size(); i++){
                for (int j = 0; j < animals.size(); j++){

                    if (animals.get(j).population > 0 && animals.get(i).population > 0){
                        if (j != i){
                            animals.get(j).procreate();
                            animals.get(j).fight(animals.get(i));

                            for (int n = 0; n< animals.size() ; n++){

                                System.out.println(animals.get(n).population);
                            }
                                System.out.println("|||||||||||||||||||||||||||||||||||||");



                        }
                    }
                }
            }


            System.out.println("----------------------");

            aliveanimals = 0;
            for (int i = 0; i < animals.size(); i ++){
                if (animals.get(i).population > 0){
                    aliveanimals ++;
                }
            }
        }
        for (int i = 0; i< animals.size(); i++){
            if (animals.get(i).population > 0){
                System.out.println(animals.get(i).name + " Won!!!!");
            }
        }



    }
}
