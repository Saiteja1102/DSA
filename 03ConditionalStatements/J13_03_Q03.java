/*
Question 3 : Write a Java program to input week number(1-7) and print day of week name
using switch case.
*/

import java.util.Scanner;

public class J13_03_Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(1-7): ");
        int weeknum = sc.nextInt();

        switch (weeknum){
            case 1: System.out.println("Sunday");
                    break;
            case 2: System.out.println("Monday");
                    break;
            case 3: System.out.println("Tuesday");
                    break;
            case 4: System.out.println("Wednesday");
                    break;
            case 5: System.out.println("Thursday");
                    break;
            case 6: System.out.println("Friday");
                    break;
            case 7: System.out.println("Saturday");
                    break;
            default: System.out.println("Week has only 7 days. Enter correct number");
        }
    }
}
