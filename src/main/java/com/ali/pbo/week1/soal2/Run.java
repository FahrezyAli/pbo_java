package com.ali.pbo.week1.soal2;

import com.ali.pbo.Helper;

public class Run
{
    public static final Novel classroomOfTheElite = new Novel("Classroom of the Elite", "Syougo Kinugasa", 2015, 65000);

    public static final Novel mariposa = new Novel("Mariposa", "Luluk HF", 2018, 20000);

    public static final Novel ikarosInTheSky = new Novel("Ikaros in the Sky", "Heijiro Yamamoto", 2012, 125000);

    public static void main(String[] args)
    {
        Helper.println(classroomOfTheElite.getDescription());
        Helper.println("Harga beli: " + classroomOfTheElite.getPrize());
        Helper.println("Harga jual: " + classroomOfTheElite.getSellPrize());

        Helper.println("");
        Helper.println(mariposa.getDescription());
        Helper.println("Harga beli: " + mariposa.getPrize());
        Helper.println("Harga jual: " + mariposa.getSellPrize());

        Helper.println("\n");
        Helper.println(ikarosInTheSky.getDescription());
        Helper.println("Harga beli: " + ikarosInTheSky.getPrize());
        Helper.println("Harga jual: " + ikarosInTheSky.getSellPrize());
    }
}
