package com.company;

import com.sun.deploy.util.StringUtils;

import java.io.File;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Game game = new Game();
        SudokuSolver sudokuSolver = new SudokuSolver();
        Validator validator = new Validator();
        Scanner reader = new Scanner(System.in);


        SaverLoader saverLoader = new SaverLoader();

        boolean notfinito = true;
        while (notfinito) {
            System.out.println("there are " + game.sudokuPuzzles.size() + " puzzles available\n" +
                    "wat do you wana do?\n" +
                    "1 = load a sudoku Puzzle from file\n" +
                    "2 = save a sudokuPuzzle to a file\n" +
                    "3 = print a sudoku Puzzle\n" +
                    "4 = check if a sudoku Puzzle is solved\n" +
                    "5 = solve a sudoku Puzzle with a simple algorithm\n" +
                    "6 = EXIT");

            String string = reader.next();
            if (string.equals("1")) {
                System.out.println("wat is the name of the file?");
                String path = reader.next();
                File varTmpDir = new File(path);
                boolean exists = varTmpDir.exists();
                if (exists) {
                    game.sudokuPuzzles.add(saverLoader.Load(path));
                } else {
                    System.out.println("file with this name was not found!");
                }
            } else if (string.equals("2")) {

                System.out.println("there are " + game.sudokuPuzzles.size() + " puzzles in the game\n" +
                        "pleas type index the index of the puzle you want to save");

                for (int i = 0; i < game.sudokuPuzzles.size(); i++) {
                    System.out.println(i + " = " + game.sudokuPuzzles.get(i).name);
                }
                String input = reader.next();
                if (isNumeric(input)) {
                    int index = Integer.parseInt(input);

                    if (index > game.sudokuPuzzles.size() - 1 || index < 0) {
                        System.out.println("index does not match with id's");
                    } else {
                        System.out.println("pleas type the name of the file");
                        String name = reader.next();
                        saverLoader.Save(name, game.sudokuPuzzles.get(index));
                    }
                } else {
                    System.out.println("input was not a integer");
                }

            } else if (string.equals("3")) {

                System.out.println("there are " + game.sudokuPuzzles.size() + " puzzles in the game\n" +
                        "pleas type index the index of the puzle you want to print");

                for (int i = 0; i < game.sudokuPuzzles.size(); i++) {
                    System.out.println(i + " = " + game.sudokuPuzzles.get(i).name);
                }
                String input = reader.next();
                if (isNumeric(input)) {
                    int index = Integer.parseInt(input);

                    if (index > game.sudokuPuzzles.size() - 1 || index < 0) {
                        System.out.println("index does not match with id's");
                    } else {
                        game.PrintSudoku(game.sudokuPuzzles.get(index).puzzle);
                    }
                } else {
                    System.out.println("input was not a integer");
                }

            } else if (string.equals("4")) {
                System.out.println("there are " + game.sudokuPuzzles.size() + " puzzles in the game\n" +
                        "pleas type index the index of the puzle you want to check");

                for (int i = 0; i < game.sudokuPuzzles.size(); i++) {
                    System.out.println(i + " = " + game.sudokuPuzzles.get(i).name);
                }
                String input = reader.next();
                if (isNumeric(input)) {

                    int index = Integer.parseInt(input);
                    if (index > game.sudokuPuzzles.size() - 1 || index < 0) {
                        System.out.println("index does not match with id's");
                    } else {
                        if (validator.SudokuValidat(game.sudokuPuzzles.get(index).puzzle)) {
                            System.out.println("the puzzle is a solved puzzle!\n");
                        } else {
                            System.out.println("the puzzle is a unsolved puzzle!\n");
                        }
                    }

                } else {
                    System.out.println("input was not a integer");
                }

            } else if (string.equals("5")) {
                System.out.println("there are " + game.sudokuPuzzles.size() + " puzzles in the game\n" +
                        "pleas type index the index of the puzle you want to check");

                for (int i = 0; i < game.sudokuPuzzles.size(); i++) {
                    System.out.println(i + " = " + game.sudokuPuzzles.get(i).name);
                }
                String input = reader.next();
                if (isNumeric(input)) {
                    int index = Integer.parseInt(string);
                    if (index > game.sudokuPuzzles.size() - 1 || index < 0) {
                        System.out.println("index does not match with id's");
                    } else {
                        sudokuSolver.SimpleSolveSudoku(game.sudokuPuzzles.get(index).puzzle);
                    }
                } else {
                    System.out.println("input was not a integer");
                }

            } else if (string.equals("6")) {
                notfinito = false;
            } else {
                System.out.println("invalid input");
            }
        }
        game.PrintSudoku(saverLoader.Load("test.json").puzzle);


    }

    public static boolean isNumeric(String str) {
        try {
            int i = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
