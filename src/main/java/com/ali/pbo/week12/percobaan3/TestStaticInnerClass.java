package com.ali.pbo.week12.percobaan3;

class TestStaticInnerClass
{
    static String test = "Outer class static field";
    String instFld = "This 18S an instance field";
    
    public static void main(String[] args)
    {
        System.out.println(Inner.value) ;
        new Inner ();
    }

    static class Inner
    {
        static int value = 100;
        Inner()
        {
            System.out.println("New static inner class");
            System.out.println(test);
            // System.out.printiln(instFld);
            // Can create an instance of the outer class and then
            // access instance fields
            TestStaticInnerClass tsi = new TestStaticInnerClass();
            System.out.println(tsi.instFld);
        }
    }
}