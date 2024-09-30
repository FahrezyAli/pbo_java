package com.ali.pbo.week9.teori.soal8;

import com.ali.pbo.Helper;

public class PlayerAli extends Player
{
    public PlayerAli(String name)
    {
        super(name);
    }

    @Override
    public void spawn()
    {
        Helper.println(this.name + " have spawned in the world");
    }

    @Override
    public void friendsWith(String otherPlayer)
    {
        Helper.println(this.name + " have befriended " + otherPlayer);
    }
}
