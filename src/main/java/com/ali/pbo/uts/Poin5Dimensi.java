package com.ali.pbo.uts;

public class Poin5Dimensi
{
    private int x0;
    private int x1;
    private int x2;
    private int x3;
    private int x4;

    public Poin5Dimensi(int x0, int x1, int x2, int x3, int x4)
    {
        this.x0 = x0;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
    }

    public void setElements(int x0, int x1, int x2, int x3, int x4)
    {
        this.x0 = x0;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
    }

    public int getElements(int n)
    {
        switch(n)
        {
            case 0: return x0;
            case 1: return x1;
            case 2: return x2;
            case 3: return x3;
            case 4: return x4;
            default: return x0;
        }
    }

    public double w(Poin5Dimensi B)
    {
        double a = Math.pow(this.x0 - B.x0, 3);
        double b = Math.pow(this.x1 - B.x1, 3);
        double c = Math.pow(this.x2 - B.x2, 3);
        double d = Math.pow(this.x3 - B.x3, 3);
        double e = Math.pow(this.x4 - B.x4, 3);
        return Math.cbrt(a + b + c + d + e);
    }

    public void tampil()
    {
        System.out.println("(" + this.x0 + ", " + this.x1 + ", " + this.x2 + ", " + this.x3 + ", " + this.x4 + ")");
    }

    public static void main(String[] args)
    {
        final Poin5Dimensi A =  new Poin5Dimensi(1, 2, 3, 4, 5);
        final Poin5Dimensi B =  new Poin5Dimensi(6, 7, 8, 9, 10);

        A.tampil();
        System.out.println(A.getElements(4));
        System.out.println(A.w(B));
    }
}
