package com.company;

import com.company.Cyborgs.Reptiles.Crocodile;
import com.company.Cyborgs.Reptiles.Iguana;
import com.company.Cyborgs.Reptiles.Reptile;
import com.company.Mamals.Lion;
import com.company.Mamals.RedPanda;

import java.util.ArrayList;
import java.util.Scanner;

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

        while (notFinito){
            System.out.println("wat do you wanna do?\n 1 = FightclubNight \n 2 = MamalFighting \n 3 = ReptileFighting \n 4 = regenerate \n 5 = EXIT");
            String string = reader.next();
            if (string.equals("1")){
                fightClub.FightclubNight(animals);
            }else if (string.equals("2")){
                fightClub.MamalFighting(animals);
            }else if (string.equals("3")){
                fightClub.ReptileFighting(animals);
            }else if (string.equals("4")){
                for (int i = 0; i<animals.size(); i++){
                    animals.get(i).Regenerate();
                }
            }else if (string.equals("5")){
                notFinito = false;
            }else {
                System.out.println("invalid input");
            }
        }
    }


}
