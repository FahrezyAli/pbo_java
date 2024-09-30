package com.ali.pbo.week1.soal3;

import java.util.ArrayList;
import java.util.List;

public class Random
{
    private int start;
    private int diff;
    private int count;

    public Random(int start, int diff, int count)
    {
        this.start = start;
        this.diff = diff;
        this.count = count;
    }

    public List<Integer> generate()
    {
        int i = this.count;
        int j = this.start;
        List<Integer> random = new ArrayList<>();
        while(i > 0)
        {
            random.add(j);
            j += this.diff;
            i -= 1;
        }
        return random;
    }
}
