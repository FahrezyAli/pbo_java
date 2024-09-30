package com.ali.pbo.week12.percobaan6;

class TestAnonymous
{
    public static void main(String[] str)
    {
        final int d = 10;
        Father f = new Father(d);
        Father fanon = new Father(d)
        {
            // override method parent
            void methoda(int x)
            {
                System.out.println("Anonymous : " + x);
            }
            
            // overload method parent
            void methodb(String str) {
                System.out.println("Anonymous : " + str);
            }

            // penambahan method baru di anonymous
            void newMethod()
            {
                System.out.println("New Method in Anonymous ; ");
            }
        };
        
        f.methoda(5);
        fanon.methoda(5);
    // fanon.method("New Number") // ini akan error
    // fanon.newMethod(); // ini akan error
    }
}
