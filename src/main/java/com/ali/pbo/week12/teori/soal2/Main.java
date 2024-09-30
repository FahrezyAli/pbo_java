package com.ali.pbo.week12.teori.soal2;

public class Main
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.eat();

        Mammal mammal = new Mammal();
        mammal.displayInfo();
        Mammal.cekMethodStatic();
        mammal.mammalEat();
        mammal.tampilVarStatic();

        Reptile reptile = new Reptile();
        reptile.displayInfo();
        reptile.reptileEat();
    }
}