package com.ali.pbo.week1.soal1;

import com.ali.pbo.Helper;

public class Run
{
    public static final Number ten = new Number(10);

    public static final Number negativeSix = new Number(-6);

    public static final Number five = new Number(5);

    public static final Number negativeTwentyThree = new Number(-23);

    public static void main(String[] args)
    {
        Helper.println(ten.getNumber() + ": " + ten.getState());

        Helper.println(negativeSix.getNumber() + ": " + negativeSix.getState());

        Helper.println(five.getNumber() + ": " + five.getState());

        Helper.println(negativeTwentyThree.getNumber() + ": " + negativeTwentyThree.getState());
    }
}
