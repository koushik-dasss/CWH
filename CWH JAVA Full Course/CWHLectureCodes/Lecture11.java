package CWHLectureCodes;

import java.util.Scanner;
public class Lecture11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Assignment - 1


        System.out.println("Enter the full marks of all 5 subjects in order: ");
        double fm1 = sc.nextDouble(), fm2 = sc.nextDouble(), fm3 = sc.nextDouble() , fm4 = sc.nextDouble(), fm5 = sc.nextDouble();
        System.out.println("Enter the secured marks of all 5 subjects in order , with respect to total marks : ");
        double sm1 = sc.nextDouble(), sm2 = sc.nextDouble(), sm3 = sc.nextDouble() , sm4 = sc.nextDouble(), sm5 = sc.nextDouble();
        double sum_of_sm = sm1+sm2+sm3+sm4+sm5;
        double sum_of_fm = fm1+fm2+fm3+fm4+fm5;
        double percentage = ((sum_of_sm)/(sum_of_fm))*100;
        System.out.println("The CBSE percentage of the student is : "+ percentage );
    }
}
