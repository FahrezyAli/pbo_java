package com.ali.pbo.week12.latihan1;

public class Problem
{
    static String s;
    
    static class Inner
    {
        void testMethod()
        {
            s = "Set from Inner";
        }
    }

    static class Run
    {
        public static void main(String[] args)
        {
            Inner inner = new Inner();
            inner.testMethod();
            System.out.println(s);
        }
    }
}