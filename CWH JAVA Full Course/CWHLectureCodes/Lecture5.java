package CWHLectureCodes;
import java.util.Scanner;
public class Lecture5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("It works !");
        System.out.println("Taking input from the scanner :");
        System.out.println("Enter number-1  :");
        int a = sc.nextInt();
        System.out.println("Enter number-2  :");
        int b = sc.nextInt();
        System.out.println("The sum is : "+(a+b));
        System.out.println("Enter floating number-1 : ");
        float c = sc.nextFloat();
        System.out.println("Enter floating number-2: ");
        float d = sc.nextFloat();

        // Consume the remaining newline character
        sc.nextLine();

        System.out.println("The sum is : "+ (c+d));



        // Checking whether the input from the keyboard is an integer or not

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);


        // OR
        System.out.println(sc.hasNextInt());

        // Checking whether the input from the keyboard is a float or not

        boolean b2 = sc.hasNextFloat();
        System.out.println(b2);

        // OR
        System.out.println(sc.hasNextFloat());

        // Reading a string(word) and  lines of string


        // Consume the remaining newline character
        sc.nextLine();
        System.out.println("Enter a string: ");
        String  str1 = sc.next(); // Reads the string unless and until there is no white space present.
        // Consume the remaining newline character
        sc.nextLine();
        System.out.println("Enter  a string line : ");
        String str2 = sc.nextLine(); // Reads the entire lines of string.
        System.out.println(str1);
        System.out.println(str2);







    }
}
