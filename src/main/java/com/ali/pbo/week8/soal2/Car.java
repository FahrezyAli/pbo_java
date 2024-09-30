package com.ali.pbo.week8.soal2;

import com.ali.pbo.Helper;

public class Car extends Vehicle
{
    private int nbOfSeats;

    public void setNbOfSeats(int nbOfSeats)
    {
        this.nbOfSeats = nbOfSeats;
    }

    public int getNbOfSeats()
    {
        return this.nbOfSeats;
    }

    @Override
    public void start()
    {
        Helper.println("Car start code");
    }
}
