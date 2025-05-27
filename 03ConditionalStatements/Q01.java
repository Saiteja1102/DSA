/*
Question 1 : Write a Java program to get a number from the user and print whether it is
positive or negative.
*/
import java.util.*;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if(number >= 0){
            System.out.println(number + " is positive");
        }
        else{
            System.out.println(number + " is negative");
        }

        sc.close();
    }
}
