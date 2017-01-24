package com.company;

import java.util.ArrayList;


public class SudokuSolver {
    Validator validator = new Validator();

    //a method witch solves simple sudoku puzzle with a definitive solution.
    public int[][] SimpleSolveSudoku(int[][] puzzle){
        //check if the given puzzle is a valid puzzle
        if (validator.PossiblePuzzleValidate(puzzle)){

            //repeats the algorithm until the SudokuValidat method returns true
            while (!validator.SudokuValidat(puzzle)){
                //iterates through all boxes of the puzzle (i = number of box the iteration is on)
                for (int i = 0; i < 9; i++){
                    //iterates through all possible numbers
                    for (int t = 1; t <10;t++) {
                        //an arrayList of Coordination's to store the possible positions the number could legally be put in.
                        ArrayList<Coordination> coordinations = new ArrayList<>();
                        //checks if the box already contains the number. if yes there is no need to look further
                        boolean validNumber = true;
                        for (int a = 0; a < 9; a++){
                            if (puzzle[a / 3 + i / 3 * 3][a % 3 + i % 3 * 3] == t){
                                validNumber = false;
                            }
                        }

                        if (validNumber){
                            //iterates through all locations in the box and checks if the number could legacy be there
                            for (int j = 0; j < 9; j++){
                                boolean validLocation = true;
                                //checks if the location is already used.
                                if (puzzle[j / 3 + i / 3 * 3][j % 3 + i % 3 * 3] != 0){
                                    validLocation = false;
                                }
                                //checks if the number is already present on the x axle of the location
                                for (int x =0; x < 9; x++){
                                    if (puzzle[x][j % 3 + i % 3 * 3] == t){
                                        validLocation = false;
                                    }
                                }
                                //checks if the number is already present on the y axle of the location
                                for (int y =0; y < 9; y++){
                                    if (puzzle[j / 3 + i / 3 * 3][y] == t){
                                        validLocation = false;
                                    }
                                }
                                //if the location is valid adds the location to the array of valid locations
                                if (validLocation){
                                    coordinations.add(new Coordination(j / 3 + i / 3 * 3, j % 3 + i % 3 * 3));
                                }
                            }
                        }
                        //if there is only one valid location for the number in the box it sets the number on the location
                        if (coordinations.size() == 1){
                            puzzle[coordinations.get(0).x][coordinations.get(0).y] = t;
                        }
                    }
                }
            }
        }else {
            System.out.println("invalid input");
        }


        return puzzle;
    }

    //solves the sudoku by randomly assigning number to the empty fields until it is correct.
    //Can theoretical solve the puzzle it would however most likely take a very long time.
    public int[][] RandomSolve(int[][] puzzle){
        //copy of puzzle to try out variations
        int tempPuzzle[][] = puzzle;
        //boolean to check if the puzzle is solved
        boolean valid = validator.SudokuValidat(tempPuzzle);
        while (!valid){
            tempPuzzle = puzzle;
            for (int i = 0; i<9; i++){
                for (int j = 0; j<9; j++){
                    if (tempPuzzle[i][j] == 0){
                        tempPuzzle[i][j] = 1 + (int)(Math.random() * 9);
                    }
                }
            }
            if (validator.SudokuValidat(tempPuzzle)){
                valid = true;
            }
        }
        return tempPuzzle;
    }
}
