package com.ali.pbo.week14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DocReader
{
    public static String readFile(String path)
    {
        StringBuilder str = new StringBuilder();
        try
        {
            File file = new File(path);
            Scanner read = new Scanner(file);
            while(read.hasNextLine())
            {
                str.append(read.nextLine());
                str.append("\n");
            }
            str.deleteCharAt(str.length() - 1);
            read.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return str.toString();
    }

    public static List<String> separateString(String string, String separator)
    {
        return Arrays.asList(string.split(separator));
    }

    public static boolean isSimilar(String fileA, String fileB)
    {
        List<String> wordsA = separateString(fileA, "[ \n]");
        List<String> wordsB = separateString(fileB, "[ \n]");
        WordCounter similarity = new WordCounter(fileA, wordsB);
        int size = Math.max(wordsA.size(), wordsB.size());
        return similarity.getTotal() > size / 2;
    }
}
