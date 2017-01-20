package com.company;

import java.util.ArrayList;


public class SudokuSolver {

    public SudokuSolver(){

    }

    public int[][] SimpleSolveSudoku(int[][] puzzle){



            for (int i = 0; i < 9; i++){
                for (int t = 1; t <10;t++) {
                        ArrayList<Coordination> coordinations = new ArrayList<>();

                    ArrayList<Integer> numbers = new ArrayList<>();
                    boolean validLocatin = true;


//                    for (int a = 0; a < 9; a++){
//                        if (puzzle[a / 3 + i / 3 * 3][a % 3 + i % 3 * 3] == t){
//                            validLocatin = false;
//                        }
//                    }
                    for (int j = 0; j < 9; j++){
                        if (puzzle[j / 3 + i / 3 * 3][j % 3 + i % 3 * 3] != 0){
                            validLocatin = false;
                        }
                        for (int x =0; x < 9; x++){
                            if (puzzle[x][j % 3 + i % 3 * 3] == t){
                                validLocatin = false;
                            }
                        }
                        for (int y =0; y < 9; y++){
                            if (puzzle[j / 3 + i / 3 * 3][y] == t){
                                validLocatin = false;
                            }
                        }

                        if (validLocatin){
                            numbers.add(new Coordination(j / 3 + i / 3 * 3, j % 3 + i % 3 * 3));
                        }
                    }




            }
        }








        return puzzle;
    }




    public int[][] RandomSolve(int[][] puzzle){
        int tempPuzzle[][] = puzzle;
        boolean valid = SudokuValidat(tempPuzzle);
        while (!valid){
            tempPuzzle = puzzle;
            for (int i = 0; i<9; i++){
                for (int j = 0; j<9; j++){
                    if (tempPuzzle[i][j] == 0){
                        tempPuzzle[i][j] = 1 + (int)(Math.random() * 9);
                    }
                }
            }
            if (SudokuValidat(tempPuzzle)){
                valid = true;
            }
        }
        return tempPuzzle;
    }

    public boolean SudokuValidat(int[][] puzzle){


//        System.out.println("\n horizontal check");
        //horizontal check

            for (int x=0; x< 9; x++){
//                System.out.println("");

                ArrayList<Integer> numbers = new ArrayList<>();
                for (int y=0; y< 9; y++){
//                    System.out.print(" " + puzzle[x][y]);

                    if (puzzle[x][y] == 0){
                        return false;
                    }

                    if (numbers.contains(puzzle[x][y])){
                        return false;
                    }else {
                        numbers.add(puzzle[x][y]);
                    }
                }
            }

//        System.out.println("\n \n Vertical check");
        //vertical check
            for (int y=0; y< 9; y++){
//                System.out.println("");

                ArrayList<Integer> numbers = new ArrayList<>();
                for (int x=0; x< 8; x++){

//                    System.out.print(" " + puzzle[x][y]);


                    if (puzzle[x][y] == 0){
                        return false;
                    }

                    if (numbers.contains(puzzle[x][y])){
                        return false;
                    }else {
                        numbers.add(puzzle[x][y]);
                    }
                }
            }

//        System.out.println("\n \n Box check");
        //Box check
            for (int i = 0; i < 9; i++){

                ArrayList<Integer> numbers = new ArrayList<>();
//                System.out.println("\n");
                for (int j = 0; j < 9; j++){



                    System.out.print(" " + puzzle[j / 3 + i / 3 * 3][j % 3 + i % 3 * 3]);


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
}
