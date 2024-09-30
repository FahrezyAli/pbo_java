package com.ali.pbo.week12.percobaan5;

class TestLocalInner
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        o.display();
        // new Outer.new Local(); // doesn't compile
    }
}

class Outer
{
    static String classFld = "static class members are accessible";
    String instFld = "instance flds of enclosing class are accessible";
    
    void display()
    {
        final String str = "only final method variables are accessible";
        class Local
        {
            Local()
            {
                System.out.println(str);
                System.out.println(classFld);
                System.out.println(instFld);
            }
        }
    // can only be created within the enclosing block
    new Local();
    }
    // this won't work
    // new Local();
}