package com.company;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.*;

public class SaverLoader {

    //Saves a SudokuPuzzle ŵith the given name
    public void Save(String path, SudokuPuzzle sudokuPuzzle) {

        Gson gson = new Gson();
        File file = new File(path);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            if (!file.exists()) {
                file.createNewFile();
            }

            byte[] contentInBytes = gson.toJson(sudokuPuzzle).getBytes();

            fileOutputStream.write(contentInBytes);
            fileOutputStream.flush();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //Loadas a SudokuPuzzle ŵith the given name
    public SudokuPuzzle Load(String path) {
        JsonObject obj = new JsonObject();
        Gson gson = new Gson();

        File file = new File(path);

        try {
            FileInputStream fileInputStream = new FileInputStream(file);


            int content;
            String string = new String();
            while ((content = fileInputStream.read()) != -1) {
                string += (char) content;
            }


            SudokuPuzzle sudokuPuzzle = gson.fromJson(string, SudokuPuzzle.class);

            return sudokuPuzzle;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

}
