package com.ali.pbo.week9.latihan2;

import java.util.Scanner;

import com.ali.pbo.Helper;

public class Run
{
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Helper.println("1. Game Arcade\n2. Game Strategy");
        Helper.print("Pilih game anda: ");
        int game = input.nextInt();
        
        Helper.print("Silahkan input nama anda: ");
        String namaPemain = input.next();

        Helper.println("1 - 20  : Easy\n21 - 80 : Normal\n81-100: Hard");
        Helper.print("Silahkan input level permainan: ");
        int levelPemain = input.nextInt();

        if (game == 1)
        {
            final PermainanArcade arcade = new PermainanArcade();
            arcade.setNamaPemain(namaPemain);
            arcade.setLevelPemain(levelPemain);
            arcade.jalankan();
        } else 
        {
            final PermainanStrategy strategy = new PermainanStrategy();
            strategy.setNamaPemain(namaPemain);
            strategy.setLevelPemain(levelPemain);
            strategy.jalankan();
        }
    }
}
