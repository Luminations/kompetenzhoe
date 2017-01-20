package com.company;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        SudokuSolver sudokuSolver = new SudokuSolver();
        Validator validator = new Validator();

//        sudokuSolver.SimpleSolveSudoku(game.unsolvedPuzzle);
//        System.out.println(validator.SudokuValidat(game.unsolvedPuzzle));
        System.out.println(validator.PossiblePuzzleValidate(game.unsolvedPuzzle));

//        game.PrintSudoku(game.unsolvedPuzzle);


    }
}
