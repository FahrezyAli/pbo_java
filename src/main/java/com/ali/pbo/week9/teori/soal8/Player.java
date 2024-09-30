package com.ali.pbo.week9.teori.soal8;

import com.ali.pbo.Helper;

public abstract class Player implements Entity, Friendly
{
    protected String name;

    protected Player(String name)
    {
        this.name = name;
    }

    public void move(String direction, int numberOfSteps)
    {
        Helper.println(this.name + " move " + numberOfSteps + " steps to the " + direction);
    }
}
