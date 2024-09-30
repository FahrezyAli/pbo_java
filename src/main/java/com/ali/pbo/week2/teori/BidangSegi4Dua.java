package com.ali.pbo.week2.teori;

public class BidangSegi4Dua
{
    private int panjang;
    private int lebar;

    public void setPanjang(int panjang)
    {
        this.panjang = panjang;
    }

    public void setLebar(int lebar)
    {
        this.lebar = lebar;
    }

    public int getPanjang()
    {
        return this.panjang;
    }

    public int getLebar()
    {
        return this.lebar;
    }

    public int luasBujurSangkar()
    {
        return this.panjang * this.panjang;
    }

    public int luasPersegiPanjang()
    {
        return this.panjang * this.lebar;
    }
}
