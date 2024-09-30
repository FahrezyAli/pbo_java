package com.ali.pbo.week12.percobaan7;

public class Parcell
{
    public Tujuan ke(String s)
    {
        class Tujuannya implements Tujuan
        {
            private String label;
            
            Tujuannya(String tuj)
            {
                label = tuj;
            }
            
            public String bacaLabel()
            {
                return label;
            }
        }
        return new Tujuannya(s);
    }
    
    public static void main(String[] args)
    {
        Parcell pl = new Parcell();
        Tujuan t = pl.ke("Bali");
        System.out.println(t.bacaLabel());
    }
}

interface Tujuan{
    String bacaLabel();
}