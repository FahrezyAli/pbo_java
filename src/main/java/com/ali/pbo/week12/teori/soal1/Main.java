package com.ali.pbo.week12.teori.soal1;

import com.ali.pbo.week12.teori.soal1.Animal.Mammal;
import com.ali.pbo.week12.teori.soal1.Animal.Reptile;

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

        Reptile reptile = animal.new Reptile();
        reptile.displayInfo();
        reptile.reptileEat();
    }
}