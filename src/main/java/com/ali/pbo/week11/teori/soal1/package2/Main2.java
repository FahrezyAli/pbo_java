package com.ali.pbo.week11.teori.soal1.package2;

import com.ali.pbo.Helper;
import com.ali.pbo.week11.teori.soal1.package1.Main1;

public class Main2
{
    public static void main(String[] args)
    {
        final Class2_1 CLASS2_1_INST = new Class2_1(10, "HI");
        Helper.println("Variable of Class1: " + CLASS2_1_INST.getVar1());
        Helper.println("Variable of Class1: " + CLASS2_1_INST.getVar2());

        Helper.newLine();
        Main1.main(args);
    }
}
