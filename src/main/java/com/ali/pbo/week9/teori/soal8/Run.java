package com.ali.pbo.week9.teori.soal8;

public class Run
{
    public static void main(String[] args)
    {
        final Player ali = new PlayerAli("Ali");
        ali.spawn();
        ali.move("Left", 15);
        ali.friendsWith("Arga");
        ali.move("Right", 5);
    }
}
