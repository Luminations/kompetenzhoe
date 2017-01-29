package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Game {

    ArrayList<SudokuPuzzle> sudokuPuzzles;

    public Game(){
        sudokuPuzzles = new ArrayList<>();
        sudokuPuzzles.add(new SudokuPuzzle(new int[][]
                        {{0, 4, 0, 0, 0, 0, 1, 0, 3},
                        {0, 0, 0, 8, 1, 0, 7, 0, 4},
                        {0, 3, 0, 6, 0, 0, 8, 9, 2},
                        {8, 0, 0, 0, 0, 2, 0, 4, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 0},
                        {9, 7, 0, 0, 0, 8, 0, 0, 1},
                        {4, 0, 9, 0, 0, 0, 6, 0, 0},
                        {0, 0, 1, 0, 4, 7, 3, 0, 0},
                        {0, 0, 7, 1, 2, 0, 0, 0, 0}},
                        "unsolvedPuzzle"));
    }




    //prints a Sudoku in proper format so that it is easy to read
    public void PrintSudoku(int[][] puzzle){

        for (int x = 1; x < 10 ; x ++){

            for (int y = 0; y < 9 ; y ++){
                if (y % 3 == 0){
                    System.out.print("   " + puzzle[x - 1][y]);
                }else {
                    System.out.print(" " + puzzle[x - 1][y]);
                }
            }

            if (x % 3 == 0){
                System.out.println("\n");
            }else {
                System.out.println();
            }
        }
    }
}

