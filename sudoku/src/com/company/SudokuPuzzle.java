package com.company;

/**
 * Created by fraser on 1/29/17.
 */
public class SudokuPuzzle {
    public String name = "default";
    public int[][] puzzle;

    public SudokuPuzzle(){

    }

    public SudokuPuzzle(int[][] puzzle, String name){
        this.puzzle = puzzle;
        this.name = name;
    }
}
