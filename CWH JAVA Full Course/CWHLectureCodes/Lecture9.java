package CWHLectureCodes;

public class Lecture9 {
    public static void main(String[] args) {
        int a = 6*5-34/2; // same precedence of * and / , left to right
        System.out.println(a);
        // a = 30 - 17
        // a = 13


        // Precedence and Associativity
        // Precedence - Rank holder
        // Associativity - Tie-breaker


        int b = 6/5 -34*2 ; // same precedence of * and / , left to right
        // b = 1 - 68
        // b = -67
        System.out.println(b);

        int c = 60/5 - 34*2;
        // c = 12 - 68
        // c = -56
        System.out.println(c);

        a=b=45;
        // Associativity is from right to left
        // b = 45 first
        // a = b , a = 45



        // Expression-1
         int x = 10 , y = 20;
        System.out.println((x-y)/2);
        // Expression-2
        int b1 = 1 , a1 = 1 , c1 = 1;
        System.out.println(b1*b1-4*a1*c1/(2*a1));
        // Expression-3
        int v = 2 , u = 2;
        System.out.println(v*v - u*u);
        // Expression-4
        int a2 = 1 , b2 = 1 , d = 1 ;
        System.out.println(a2*b2-d);










    }
}
