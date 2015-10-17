package com.example.harsh.myapplication;

import java.io.*;import java.io.FileWriter;

import java.io.IOException;


import java.util.ArrayList;
import java.util.List;

import com.example.harsh.myapplication.Registration;

/**
 * Created by Harsh on 10/17/2015.
 */

public class CSVFileWriter {
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    //CSV file header
    private static final String FILE_HEADER = "Name, Email, Address";

    public static void GenAndWriteCsvFile(String fileName, Registration r) {


        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write a new student object list to the CSV file

                fileWriter.append(String.valueOf(r.getName()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(r.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(r.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);




            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }

    public static void AppendCsvFile(String fileName, Registration r) {


        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);


            //Write a new student object list to the CSV file

                fileWriter.append(r.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(r.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(r.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);




            System.out.println("CSV file was updated!!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }

}
