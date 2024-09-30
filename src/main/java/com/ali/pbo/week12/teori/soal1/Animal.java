package com.ali.pbo.week12.teori.soal1;

import com.ali.pbo.Helper;

public class Animal
{
    public static int cobaVarStatic = 25;

    public void eat()
    {
        Helper.println("I eat food");
    }

    public static class Mammal
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

    public class Reptile
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
}
