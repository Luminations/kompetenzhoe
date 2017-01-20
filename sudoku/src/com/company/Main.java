package com.company;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        SudokuSolver sudokuSolver = new SudokuSolver();

        sudokuSolver.SudokuValidat(game.puzzle);

//        System.out.println(sudokuSolver.SudokuValidat(game.puzzle));
//        System.out.println("\n" + sudokuSolver.SudokuValidat(game.puzzle));

//        sudokuSolver.RandomSolve(game.temppuzzle);
    }
}
