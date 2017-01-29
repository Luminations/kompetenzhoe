package com.company;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.*;
import java.nio.file.Files;
import java.util.logging.FileHandler;

/**
 * Created by fraser on 1/28/17.
 */
public class SaverLoader {



    public void Save(String path, SudokuPuzzle sudokuPuzzle){

//        JsonObject obj = new JsonObject();
        Gson gson = new Gson();

//        obj.addProperty("puzzle", gson.toJson(sudokuPuzzle));


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
            System.out.println("gg");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public SudokuPuzzle Load(String path){
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
