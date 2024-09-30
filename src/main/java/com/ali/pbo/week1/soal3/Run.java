package com.ali.pbo.week1.soal3;

import com.ali.pbo.Helper;

public class Run
{
    public static final Random random = new Random(2, 3, 4);

    public static void main(String[] args)
    {
        Helper.printList(random.generate());
    }
}
