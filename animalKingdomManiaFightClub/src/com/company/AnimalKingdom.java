package com.company;

import com.company.Cyborgs.Reptiles.Crocodile;
import com.company.Cyborgs.Reptiles.Iguana;
import com.company.Cyborgs.Reptiles.Reptile;
import com.company.Mamals.Lion;
import com.company.Mamals.RedPanda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * the main class used for the infinite input loop
 */
public class AnimalKingdom {


    public static void main(String[] args) {

        FightClub fightClub = new FightClub();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Iguana());
        animals.add(new Crocodile());
        animals.add(new RedPanda());

        Scanner reader = new Scanner(System.in);

        boolean notFinito = true;
        // a infinite input loop used to use the various method of FightClub and other stuff
        while (notFinito){
            System.out.println("wat do you wanna do?\n 1 = FightclubNight \n 2 = MamalFighting \n 3 = ReptileFighting \n 4 = regenerate \n 5 = EXIT");
            String string = reader.next();
            //all the animals fight
            if (string.equals("1")){
                fightClub.FightclubNight(animals);
            //all the Mamals fight
            }else if (string.equals("2")){
                fightClub.MamalFighting(animals);
            //all the Reptiles Fight
            }else if (string.equals("3")){
                fightClub.ReptileFighting(animals);
            //all the animals Regenerate
            }else if (string.equals("4")){
                for (int i = 0; i<animals.size(); i++){
                    animals.get(i).Regenerate();
                }
            //exists the programm
            }else if (string.equals("5")){
                notFinito = false;
            //everything else is a invalid input
            }else {
                System.out.println("invalid input");
            }
        }
    }


}
