package com.company;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        SudokuSolver sudokuSolver = new SudokuSolver();

        sudokuSolver.SimpleSolveSudoku(game.unsolvedPuzzle);
        System.out.println(sudokuSolver.SudokuValidat(game.unsolvedPuzzle));

        game.PrintSudoku(game.unsolvedPuzzle);


    }
}
