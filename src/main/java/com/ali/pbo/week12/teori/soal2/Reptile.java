package com.ali.pbo.week12.teori.soal2;

import com.ali.pbo.Helper;

public class Reptile extends Animal
{
    public void displayInfo()
    {
        Helper.println("I am a reptile");
    }

    public void reptileEat()
    {
        eat();
    }
}