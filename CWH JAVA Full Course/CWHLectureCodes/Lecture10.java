package CWHLectureCodes;

public class Lecture10 {
    public static void main(String[] args) {
        int a = 654 + 6 ;// 670
        System.out.println(a);
        // int + int = int
        // short + int = int
        // byte + int = int
        // long + int = int


        // Operations between byte,short,int , char results always in the form of int

        // Anything added to long,float and double  results in the larger data type form only

        // byte short char int => int
        // long , float , double => respective data types

        byte x = 5;
        int y = 6;
        int d = x + y ;
        System.out.println(d);
        float b = 6.54f + x ;
        System.out.println(b);
        // float + int = float
        // double is largest data type , > long


        // Increment and Decrement Operators

        int i = 56;
        System.out.println(i); // 56
        System.out.println(i++); // 56
        System.out.println(++i); // 58
        System.out.println(++i); // 59
        System.out.println(i++); // 59


        // i ++ = incrementing and using old value (post increment)
        // ++ i = incrementing and using new value (pre increment)

        int j = 56;
        System.out.println(j); // 56
        System.out.println(j--); // 56
        System.out.println(--j); // 54
        System.out.println(--j); // 53
        System.out.println(j--); // 53


        // i -- = decrementing and using old value (post decrement)
        // -- i = decrementing and using new value (pre decrement)

        // Incrementing and Decrementing the values

        // Can be assigned to other variables also , values are used by getting assigned


         int z = 56;
        System.out.println(z); // 56
        System.out.println(z++); // 56
        System.out.println(z); // 57
        System.out.println(++z); // 58
        System.out.println(z); // 58



        // Quick Quiz

        int y1  = 7; // 7
        int x1 = ++y1 * 8 ; // 8*8 = 64
        System.out.println(x1); // 64

        char a3 ='b';
        a3++; // c
        System.out.println(a3); // c
        ++a3;
        System.out.println(a3); // d
        a3--;
        System.out.println(a3); // c
        --a3;
        System.out.println(a3); // b

        // In character incrementation / decrementation  , prefix and postfix operators works similarly







    }
}
