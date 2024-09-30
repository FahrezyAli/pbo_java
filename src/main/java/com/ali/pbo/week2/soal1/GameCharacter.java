package com.ali.pbo.week2.soal1;

import com.ali.pbo.Helper;

public class GameCharacter
{
    private String name;
    private int lifePoint = 100;
    private int attackHitPoint;
    private int attackKickPoint;

    public GameCharacter(String name, int attackHitPoint, int attackKickPoint)
    {
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public int getLifePoint()
    {
        return this.lifePoint;
    }

    public String getName()
    {
        return this.name;
    }

    public void hit (GameCharacter enemy)
    {
        enemy.lifePoint -= this.attackHitPoint;
        Helper.println(this.name + " hit " + enemy.name + "! " + enemy.name +"'s health is now: " + enemy.lifePoint);
    }

    public void kick (GameCharacter enemy)
    {
        enemy.lifePoint -= this.attackKickPoint;
        Helper.println(this.name + " kick " + enemy.name + "! " + enemy.name +"'s health is now: " + enemy.lifePoint);
    }
}
