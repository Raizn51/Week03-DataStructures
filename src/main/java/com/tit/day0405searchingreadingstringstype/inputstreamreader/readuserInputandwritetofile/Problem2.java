package com.tit.day0405searchingreadingstringstype.inputstreamreader.readuserInputandwritetofile;
/*
InputStreamReader Problem 2: Read User Input and Write to File Using InputStreamReader
Problem:
Write a program that uses InputStreamReader to read user input from the console and write the input to a file. Each input should be written as a new line in the file.
Approach:
- Create an InputStreamReader to read from System.in (the console).
- Wrap the InputStreamReader in a BufferedReader for efficient reading.
- Create a FileWriter to write to the file.
- Read user input using readLine() and write the input to the file.
- Repeat the process until the user enters "exit" to stop inputting.
- Close the file after the input is finished.
*/

// Creating a class Problem2 to demonstrate the ReadUserInputAndWriteToFile functionality
public class Problem2
{
    public static void main(String[] args)
    {
        // Create an instance of ReadUserInputAndWriteToFile
        ReadUserInputAndWriteToFile readerWriter = new ReadUserInputAndWriteToFile();

        // Specify the file path (update this path to your local file)
        String filePath = "src/main/java/com/tit/day0405searchingreadingstringstype/inputstreamreader/readuserInputandwritetofile/ConsoleInputFile.txt";

        // Read user input from the console and write it to the file using the ReadUserInputAndWriteToFile class
        readerWriter.readInputAndWriteToFile(filePath);
    }
}
