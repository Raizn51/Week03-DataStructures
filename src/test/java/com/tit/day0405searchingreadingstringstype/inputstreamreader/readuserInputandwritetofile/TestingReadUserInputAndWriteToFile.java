package com.tit.day0405searchingreadingstringstype.inputstreamreader.readuserInputandwritetofile;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestingReadUserInputAndWriteToFile {

    @Test
    public void testReadInputAndWriteToFile() {
        // Define the file path for testing
        String filePath = "src/test/java/com/tit/day0405searchingreadingstringstype/inputstreamreader/readuserInputandwritetofile/ConsoleInputFile.txt";

        // Simulate user input using ByteArrayInputStream
        String simulatedInput = "Hello, World!\nThis is a test.\nexit\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Create an instance of the class
        ReadUserInputAndWriteToFile reader = new ReadUserInputAndWriteToFile();

        // Call the method to read input and write to the file
        reader.readInputAndWriteToFile(filePath);

        // Verify the file content
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            assertEquals("Hello, World!", br.readLine());
            assertEquals("This is a test.", br.readLine());
            assertNull(br.readLine()); // No more lines should be present
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Clean up the test file's content
        try (PrintWriter writer = new PrintWriter(filePath))
        {
            writer.print("");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while clearing the file: " + e.getMessage());
        }
    }
}
