package com.ali.pbo.week9.teori.soal1;

import com.ali.pbo.Helper;

// Class B dalam struktur
public class SwordDiamond extends Item implements ItemSword
{
    public SwordDiamond(String name)
    {
        super(name);
    }

    @Override
    public void slash(int damage, String enemy)
    {
        Helper.println(damage + " damages to " + enemy);
    }
    
}
