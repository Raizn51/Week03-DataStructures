package com.tit.day0405searchingreadingstringstype.filereader.readafile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Creating a class ReadAFiIe to represent reading a file line by line using FileReader
public class ReadAFiIe
{
    // Method to read a file line by line and print each line to the console
    public void readAFileLineByLine(String filePath)
    {
        // Try-with-resources statement to ensure the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            // Loop to read each line from the file and print it to the console
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }
    }
}