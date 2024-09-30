package com.ali.pbo.week1.soal1;

public class Number
{
    private String positive;
    private String odd;
    private int num;

    public Number(int num)
    {
        if (num > 0)
        {
            this.positive = "Positif";
        } else if (num == 0)
        {
            this.positive = "Nol";
        } else this.positive = "Negatif";

        if (num % 2 == 0)
        {
            this.odd = "Genap";
        } else this.odd = "Ganjil";

        this.num = num;
    }

    public int getNumber()
    {
        return this.num;
    }

    public String getState()
    {
        return this.positive + " " + this.odd;
    }
}
