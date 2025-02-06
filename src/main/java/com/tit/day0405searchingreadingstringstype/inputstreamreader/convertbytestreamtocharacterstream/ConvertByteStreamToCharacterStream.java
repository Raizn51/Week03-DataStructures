package com.tit.day0405searchingreadingstringstype.inputstreamreader.convertbytestreamtocharacterstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

// Creating a class ConvertByteStreamToCharacterStream to represent reading binary data as characters using InputStreamReader
public class ConvertByteStreamToCharacterStream
{
    // Method to read binary data from a file and print it as characters
    public void readBinaryDataAsCharacters(String filePath)
    {
        // Try-with-resources statement to ensure the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8")))
        {
            String line;
            // Loop to read each line from the file and print it to the console
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
                // Add a 1-second wait between prints
                try
                {
                    Thread.sleep(300); // 1000 milliseconds = 1 second
                }
                catch (InterruptedException e)
                {
                    // Print the stack trace if an InterruptedException occurs
                    e.printStackTrace();
                }
            }
        }
        catch (IOException e)
        {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }
    }
}
