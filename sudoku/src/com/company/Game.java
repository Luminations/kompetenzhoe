package com.company;


public class Game {
    //this is a solved Sudoku Puzzle used to test the validation method of the SudokuSolver Class
    public int[][] solvedPuzzle =
                    {{4, 2, 6, 5, 7, 1, 3, 9, 8},
                    {8, 5, 7, 2, 9, 3, 1, 4, 6},
                    {1, 3, 9, 4, 6, 8, 2, 7, 5},
                    {9, 7, 1, 3, 8, 5, 6, 2, 4},
                    {5, 4, 3, 7, 2, 6, 8, 1, 9},
                    {6, 8, 2, 1, 4, 9, 7, 5, 3},
                    {7, 9, 4, 6, 3, 2, 5, 8, 1},
                    {2, 6, 5, 8, 1, 4, 9, 3, 7},
                    {3, 1, 8, 9, 5, 7, 4, 6, 2},};

    //this is a unsolved Sudoku Puzzle used to test the Solving methods of the SudokuSolver Class
    public int[][] unsolvedPuzzle =
                    {{0, 4, 0, 0, 0, 0, 1, 0, 3},
                    {0, 0, 0, 8, 1, 0, 7, 0, 4},
                    {0, 3, 0, 6, 0, 0, 8, 9, 2},
                    {8, 0, 0, 0, 0, 2, 0, 4, 0},
                    {0, 0, 0, 0, 0, 0, 0, 7, 0},
                    {9, 7, 0, 0, 0, 8, 0, 0, 1},
                    {4, 0, 9, 0, 0, 0, 6, 0, 0},
                    {0, 0, 1, 0, 4, 7, 3, 0, 0},
                    {0, 0, 7, 1, 2, 0, 0, 0, 0}};

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

