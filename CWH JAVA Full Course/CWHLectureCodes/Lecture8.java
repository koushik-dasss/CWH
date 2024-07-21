package CWHLectureCodes;
public class Lecture8 {
    public static void main(String[] args) {
        // 7 + 11 = 18
        // 7,11 = Operands
        // + = Operator
        // 18 = Result

        // Arithmetic  Operators

        int a = 4;
        int b = 6 + a;
        System.out.println(a);
        System.out.println(b);
        b = 6 - a ;
        System.out.println(b);
        System.out.println(a);
        b = 6 * a ;
        System.out.println(b);
        System.out.println(a);
        b =  6 / a ;
        System.out.println(b);
        System.out.println(a);
        b = 6 % a;
        System.out.println(b);
        System.out.println(a);

        b = 9 ;

        // Assignment Operators

        b+=3;
        System.out.println(b);
        b*=3;
        System.out.println(b);
        b-=3;
        System.out.println(b);
        b/=3;
        System.out.println(b);
        b%=3;
        System.out.println(b);

        // Arithmetic Operators can't work with booleans
        // % operator can work with floats and doubles
        // sign of the result where operand is % or / = sign of the first operand


        // Relational/Comparison  Operators

        // ARITHMETIC OPERATORS HAVE HIGHER PRIORITY THAN THE RELATIONAL OPERATORS .

        System.out.println(6==8);
        // System.out.println(6==6);
        // == ( Comparison/Relational   operator  , relational operator )
        // = (assignment operator)
        System.out.println(64<6);
        System.out.println(64>6);

        // Logical Operators


        // Logical AND(&&)
        // true true true , false in all other conditions
        // if the first condition is false , then the result is by default false
        // Compiler will then not check the second condition

        System.out.println(65>5 && 45<89); // true and true = true
        // System.out.println(1>2 && 3<2); // false and false = false
        System.out.println(65>5 && 3<2); // true and false = false
        // System.out.println(3<2 && 65<5); // false and false = false



        // Logical OR(||)
        // false false false  , true in all other conditions
        // if the first condition is true , then the result is by default true
        // Compiler will then not check the second condition

        // System.out.println(65>5 || 45<89); // true or true = true
        System.out.println(1>2 || 3<2); // false or false = false
        // System.out.println(65>5 || 3<2); // true or false = true
        System.out.println(3<2 || 65<5); // false or false = true


        // Logical NOT (!)
        System.out.println(!(65>5)); // false
        System.out.println(!(5>65));; // true

        // Bitwise  Operators


        // Bitwise  Operators



        // Bitwise AND(&)
        // true true true , false in all other conditions
        // if the first condition is false , then the result is by default false
        // But Compiler will  check both the  conditions separately during compilation 
        // Time Complexity and Space Complexity :- && > &

        



        // Bitwise OR(||)
        // false false false  , true in all other conditions
        // if the first condition is true , then the result is by default true
        // But Compiler will  check both  the  condition separately during compilation
        // Time Complexity and Space Complexity :- || > |
        
        
        
         





    }
}
