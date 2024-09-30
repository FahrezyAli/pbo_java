package com.ali.pbo.week12.teori.soal2;

import com.ali.pbo.Helper;

public class Mammal extends Animal
{
    public void displayInfo()
    {
        Helper.println("I am a mammal");
    }

    public static void cekMethodStatic()
    {
        Helper.println("Coba method static");
    }

    public void mammalEat()
    {
        Animal animal = new Animal();
        animal.eat();
    }

    public void tampilVarStatic()
    {
        Helper.println(cobaVarStatic);
    }
}