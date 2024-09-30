package com.ali.pbo.week12.percobaan4;

class Outer
{
    static String test;
    String str = "Outer class field";

    Outer()
    {
        new Inner ();
    }
    
    class Inner
    {
        // class defined within the body of Outer
        // static String str; // compile-error
        // static final String str; // compile-error

        static final String str = "Constant is ok";
        // static {} // static initializer not allowed
        Inner()
        {
            System.out.println(Outer.this.str);
            test = "Inherits static member";
            System.out.println(test);
        }
        // interface NeverInner(); // compile-error
    }
    public class PublicInner{}
    protected class ProtectedInner{}
    private class PrivatelInner{}
    abstract class AbstractInnec{}
    final class FinallInner{}
    static class StaticInner{}
}