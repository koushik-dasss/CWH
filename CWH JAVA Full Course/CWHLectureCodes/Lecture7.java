package CWHLectureCodes;
import java.util.Scanner;
public class Lecture7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // Question - 1 (Practice Set)

        // sum of  three numbers in JAVA
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt() , c = sc.nextInt();
        System.out.println("The sum of the three numbers is : "+ (a+b+c));


        // Question - 2

        // CGPA  using three subjects out of 100

        System.out.println("Enter the full marks of all 3 subjects in order: ");
        double fm1 = sc.nextDouble(), fm2 = sc.nextDouble(), fm3 = sc.nextDouble();
        System.out.println("Enter the secured marks of all 3 subjects in order , with respect to total marks : ");
        double sm1 = sc.nextDouble(), sm2 = sc.nextDouble(), sm3 = sc.nextDouble();
        double sum_of_sm = sm1+sm2+sm3;
        double sum_of_fm = fm1+fm2+fm3;
        double percentage = ((sum_of_sm)/(sum_of_fm))*100;
        System.out.println("The CBSE percentage of the student is : "+ percentage );



        // Question - 3

        // "Hello <name> , have a good day "

        System.out.println("Enter name : ");
        String name = sc.next();
        System.out.println("Hello "+ name + ", have a good day ");

        // Question - 4

        System.out.println("Enter the distance in kilometres : ");
        double km = sc.nextDouble();
        System.out.println("The distance in miles is : "+ (km*0.621371));

        // Question - 5

        System.out.println("Enter an integer: ");
        System.out.println(sc.hasNextInt());

        sc.nextLine();
        // Consume the remaining newline character

        // OR

        System.out.println("Enter an integer: ");
        sc.nextLine();
        // Consume the remaining newline character
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        sc.close();




    }
}
