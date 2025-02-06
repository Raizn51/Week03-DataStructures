package com.tit.day0405searchingreadingstringstype.inputstreamreader.readuserInputandwritetofile;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// Creating a class ReadUserInputAndWriteToFile to represent reading user input and writing to a file using InputStreamReader
public class ReadUserInputAndWriteToFile
{
    // Method to read user input and write it to a file
    public void readInputAndWriteToFile(String filePath)
    {
        // Try-with-resources statement to ensure the FileWriter is closed automatically
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(filePath, true)) // true to append data to the file
        {
            String input;
            System.out.println("Enter text to write to the file. Type 'exit' to finish:");
            // Loop to read user input until "exit" is entered
            while (!(input = br.readLine()).equalsIgnoreCase("exit"))
            {
                // Write the input to the file
                fw.write(input + System.lineSeparator());
            }
        }
        catch (IOException e)
        {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }
    }
}


/*
import java.io.*;
import java.util.concurrent.*;

public class ReadUserInputAndWriteToFile {
    // Method to read user input and write it to a file
    public void readInputAndWriteToFile(String filePath) {
        // Try-with-resources statement to ensure the FileWriter is closed automatically
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(filePath, true)) { // true to append data to the file
            String input;
            System.out.println("Enter text to write to the file. Type 'exit' to finish:");

            // Executor service to handle timeouts
            ExecutorService executor = Executors.newSingleThreadExecutor();

            while (true) {
                Future<String> future = executor.submit(() -> br.readLine());

                try {
                    // Wait for user input with a timeout of 5 seconds
                    input = future.get(5, TimeUnit.SECONDS);
                } catch (TimeoutException e) {
                    input = "exit";
                    future.cancel(true);
                    System.out.println("No input received. Exiting.");
                }

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // Write the input to the file
                fw.write(input + System.lineSeparator());
            }

            executor.shutdown();
        } catch (IOException | InterruptedException | ExecutionException e) {
            // Print the stack trace if an exception occurs
            e.printStackTrace();
        }
    }
}
*/