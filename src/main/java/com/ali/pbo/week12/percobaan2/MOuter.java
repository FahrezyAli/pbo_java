package com.ali.pbo.week12.percobaan2;

public class MOuter
{
    private int m = (int) (Math.random() *100);

    public static void main(String[] args)
    {
        MOuter that = new MOuter();
        that.go((int) (Math.random() *100), (int) (Math.random() *100));
    }

    public void go(int x, final int y)
    {
        int a = x+y;
        final int b = x-y;

        class MInner
        {
            public void method()
            {
                System.out.println("Nilai m adalah: " + m);
                System.out.println("Nilai x adalah: " + x);
                System.out.println("Nilai y adalah: " + y);
                System.out.println("Nilai a adalah: " + a);
                System.out.println("Nilai b adalah: " + b);
            }
        }

        MInner that = new MInner();
        that.method ();
    }
}