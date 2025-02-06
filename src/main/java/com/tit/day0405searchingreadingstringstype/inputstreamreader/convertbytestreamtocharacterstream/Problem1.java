package com.tit.day0405searchingreadingstringstype.inputstreamreader.convertbytestreamtocharacterstream;

/*
InputStreamReader Problem 1: Convert Byte Stream to Character Stream Using InputStreamReader
Problem:
Write a program that uses InputStreamReader to read binary data from a file and print it as characters. The file contains data encoded in a specific charset (e.g., UTF-8).
Approach:
- Create a FileInputStream object to read the binary data from the file.
- Wrap the FileInputStream in an InputStreamReader to convert the byte stream into a character stream.
- Use a BufferedReader to read characters efficiently from the InputStreamReader.
- Read the file line by line and print the characters to the console.
- Handle any encoding exceptions as needed.
*/

// Creating a class Problem1 to demonstrate the ConvertByteStreamToCharacterStream functionality
public class Problem1
{
    public static void main(String[] args)
    {
        // Create an instance of ConvertByteStreamToCharacterStream
        ConvertByteStreamToCharacterStream converter = new ConvertByteStreamToCharacterStream();

        // Specify the file path (update this path to your local file)
        String filePath = "src/main/java/com/tit/day0405searchingreadingstringstype/inputstreamreader/convertbytestreamtocharacterstream/large_text_file.txt";

        // Read binary data from the file and print it as characters using the ConvertByteStreamToCharacterStream class
        converter.readBinaryDataAsCharacters(filePath);
    }
}

