package com.ali.pbo.week1.soal2;

public class Novel
{
    private String title;
    private String author;
    private int releaseYear;
    private int price;

    public Novel(String title, String author, int releaseYear, int price)
    {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public String getDescription()
    {
        return "Judul dari novel ini adalah " + this.title + ". Novel ini ditulis oleh " + this.author + " dan terbit pada tahun " + this.releaseYear;
    }

    public int getPrize()
    {
        return this.price;
    }

    public float getSellPrize()
    {
        return this.price - 20F/100 * this.price;
    }
}
