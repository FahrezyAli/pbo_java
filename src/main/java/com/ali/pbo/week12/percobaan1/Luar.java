package com.ali.pbo.week12.percobaan1;

public class Luar
{
    private String variabelLuar = "Variabel Luar";
    
    class Dalam
    {
        String variabelDalam = "Variabel Dalam";
        
        public void bicara()
        {
            System.out.println(variabelDalam);
            System.out.println(variabelLuar);
        }
    }
}

class TestDalam
{
    public static void main(String[] args)
    {
        Luar l = new Luar();
        Luar.Dalam d = l.new Dalam();
        d.bicara();
    }
}