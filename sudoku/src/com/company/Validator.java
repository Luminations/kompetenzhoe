package com.company;

import java.util.ArrayList;

public class Validator {

    public boolean SudokuValidat(int[][] puzzle){

        //check if the all horizontal lines contain all different numbers and no duplicates
        for (int x=0; x< 9; x++){
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int y=0; y< 9; y++){
                if (numbers.contains(puzzle[x][y])){
                    return false;
                }else {
                    numbers.add(puzzle[x][y]);
                }
            }
        }

        //check if the all vertical lines contain all different numbers and no duplicates
        for (int y=0; y< 9; y++){

            ArrayList<Integer> numbers = new ArrayList<>();
            for (int x=0; x< 8; x++){

                if (numbers.contains(puzzle[x][y])){
                    return false;
                }else {
                    numbers.add(puzzle[x][y]);
                }
            }
        }

        //check if the all the boxes contain all different numbers and no duplicates
        for (int i = 0; i < 9; i++){

            ArrayList<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < 9; j++){

                if (puzzle[j / 3 + i / 3 * 3][j % 3 + i % 3 * 3] != 0){
                    if (!numbers.contains(puzzle[j / 3 + i / 3 * 3][j % 3 + i % 3 * 3])){

                        numbers.add(puzzle[j / 3 + i / 3 * 3][j % 3 + i % 3 * 3]);

                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean PossiblePuzzleValidate(int[][] puzzle){

        if (puzzle.length != 9){
            return false;
        }


        //check if the all horizontal lines contain all different numbers and no duplicates except zero
        for (int x=0; x< 9; x++){
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int y=0; y< 9; y++){
                if (puzzle[x][y] != 0){
                    if (numbers.contains(puzzle[x][y])){
                        return false;
                    }else {
                        numbers.add(puzzle[x][y]);
                    }
                }

            }
        }

        //check if the all vertical lines contain all different numbers and no duplicates except zero
        for (int y=0; y< 9; y++){

            ArrayList<Integer> numbers = new ArrayList<>();
            for (int x=0; x< 8; x++){

                if (puzzle[x][y] != 0){
                    if (numbers.contains(puzzle[x][y])){
                        return false;
                    }else {
                        numbers.add(puzzle[x][y]);
                    }
                }

            }
        }

        //check if the all the boxes contain all different numbers and no duplicates except zero
        for (int i = 0; i < 9; i++){

            ArrayList<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < 9; j++){

                if (puzzle[j / 3 + i / 3 * 3][j % 3 + i % 3 * 3] != 0){
                    if (!numbers.contains(puzzle[j / 3 + i / 3 * 3][j % 3 + i % 3 * 3])){

                        numbers.add(puzzle[j / 3 + i / 3 * 3][j % 3 + i % 3 * 3]);

                    }else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
