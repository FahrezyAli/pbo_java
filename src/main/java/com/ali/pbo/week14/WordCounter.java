package com.ali.pbo.week14;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;

import com.ali.pbo.Helper;

public class WordCounter
{
    private List<String> words;
    private List<Integer> counts;
    private int total;

    public WordCounter(String textToCount, List<String> wordsToCount)
    {
        this.words = new ArrayList<>(new LinkedHashSet<>(wordsToCount));
        this.counts = new ArrayList<>();
        this.total = 0;
        for (String word : this.words)
        {
            int count = 0;
            for (String s : DocReader.separateString(textToCount, "[ \n]"))
            {
                if (s.equals(word))
                {
                    count++;
                    this.total++;
                }
            }
            this.counts.add(count);
        }
    }

    public int getTotal()
    {
        return this.total;
    }

    public void display()
    {
        int i = 0;
        for (String word : this.words)
        {
            Helper.println(word + ": " + counts.get(i));
            i++;
        }
    }
}
