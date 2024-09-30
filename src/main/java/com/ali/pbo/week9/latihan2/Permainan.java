package com.ali.pbo.week9.latihan2;

import java.util.Random;
import java.util.Scanner;
import com.ali.pbo.Helper;

public abstract class Permainan
{
    private static final Scanner input = new Scanner(System.in);
    private static final Random r = new Random();

    protected String namaPemain;
    protected int levelPemain;

    public void setNamaPemain(String namaPemain)
    {
        this.namaPemain = namaPemain;
    }

    public void setLevelPemain(int levelPemain)
    {
        this.levelPemain = levelPemain;
    }

    public String getNamaPemain()
    {
        return this.namaPemain;
    }

    public int getLevelPemain()
    {
        return this.levelPemain;
    }

    public void jalankan()
    {
        Helper.println("Nama Pemain : " + this.namaPemain);
        Helper.println("Level Pemain: " + this.levelPemain);
        int hit = 0;
        int miss = 0;
        for (int i = 3; i > 0; i--)
        {
            Helper.println("Tekan ENTER untuk Menembak! Anda punya " + i + " kesempatan");
            input.nextLine();
            if (r.nextBoolean())
            {
                Helper.println("Hit!");
                hit++;
            } else
            {
                Helper.println("Miss!");
                miss++;
            }
        }
        Helper.println("Total Skor: " + hitungSkor(hit, miss));
    }

    public int hitungSkor(int hit, int miss)
    {
        return hit - miss;
    }
}
