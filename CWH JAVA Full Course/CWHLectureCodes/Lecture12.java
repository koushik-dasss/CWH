package CWHLectureCodes;

import java.util.Scanner;
public class Lecture12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Practice Set-2

        // Question - 1

        float a = 7/4 * 9/2 ; // float (4) = 4.0
        // a = 1* 9/2 = 9/2 = 4
        // ( same precedence , associativity from left to right )
        // / division operator gives the result in the form of a numeric type
        // truncates the decimal part of the result
        System.out.println(a); // 4.0

        // Question - 2

        System.out.println("Enter grade : ");
        char grade = sc.next().charAt(0);
        System.out.println("Grade is : "+ grade );
        char fake_grade = grade+=8;
        System.out.println("Encrypted (fake) grade is : "+ fake_grade);
        char real_grade = grade-=8;
        System.out.println("Decrypted (real) grade is : "+ real_grade);

        // Question - 3
        System.out.println("Enter user number :");
        int user_number = sc.nextInt() ;
        System.out.println("Enter given number :");
        int given_number = sc.nextInt();
        System.out.println(user_number > given_number);

        // Question - 4
        int V = 1 , U = 1 , A = 1 , S =1 ;
        System.out.println((V*V-U*U)/(2*A*S));

        // Question - 5
        int x = 7 ;
        int aA = x * 49/x + 35/x; // 343/7 + 5 = 49 + 5 = 54
        System.out.println(aA);
        sc.close();






    }
}

