/*
Question 2 : Write a program that reads a set of integers, and then prints the sum of the
even and odd integers. 
*/

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter -1 to come out of the loop");
        while(true){
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num == -1){
                break;
            }

            if(num % 2 == 0){
                evenSum += num;
            } else{
                oddSum += num;
            }
        }

        System.out.println("Even sum is " + evenSum);
        System.out.println("Odd sum is " + oddSum);
    }
}
