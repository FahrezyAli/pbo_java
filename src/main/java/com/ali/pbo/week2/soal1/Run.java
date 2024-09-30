package com.ali.pbo.week2.soal1;

import com.ali.pbo.Helper;

public class Run
{
    public static final GameCharacter raiden = new GameCharacter("Raiden", 10, 20);

    public static final GameCharacter subzero = new GameCharacter("Sub-Zero", 5, 25);

    public static void main(String[] args)
    {
        Helper.println(raiden.getName() + ": " + raiden.getLifePoint());
        Helper.println(subzero.getName() + ": " + subzero.getLifePoint());
        Helper.newLine();

        Helper.println(raiden.getName() + " VS " + subzero.getName());
        Helper.newLine();

        raiden.kick(subzero);
        subzero.kick(raiden);
        for (int i = 0; i < 3; i++)
        {
            subzero.hit(raiden);
        }
        for (int i = 0; i < 4; i++)
        {
            raiden.kick(subzero);
        }
        Helper.newLine();

        Helper.println(raiden.getName() + ": " + raiden.getLifePoint());
        Helper.println(subzero.getName() + ": " + subzero.getLifePoint());
        Helper.newLine();

        Helper.println("GAME OVER");
        String winner;
        if (raiden.getLifePoint() > subzero.getLifePoint())
        {
            winner = raiden.getName();
        } else winner = subzero.getName();
        Helper.println("The winner is " + winner + "!");
    }
}
