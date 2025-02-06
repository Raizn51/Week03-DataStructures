package com.tit.day0405searchingreadingstringstype.filereader.readafile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingReadAFile
{
    @Test
    public void testReadAFileLineByLine()
    {
        ReadAFiIe raf=new ReadAFiIe();
        String filePath="src/test/java/com/tit/day0405searchingreadingstringstype/filereader/readafile/large_text_file.txt";
        raf.readAFileLineByLine(filePath);
        System.out.println("readAFileLineByLine function working like expected");
    }
}
