package com.ali.pbo.week11.teori.soal1.package1;

import com.ali.pbo.Helper;

public class Main1
{
    public static void main(String[] args)
    {
        final Class1_1 CLASS1_INST = new Class1_1(10);
        final Class1_2 CLASS2_INST = new Class1_2(false);

        Helper.println("Variable of Class1: " + CLASS1_INST.getVar1());
        Helper.println("Variable of Class2: " + CLASS2_INST.getVar1());
    }
}
