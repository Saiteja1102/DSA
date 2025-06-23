/*
Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
 */

import java.util.*;

public class J11_01_Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        float average = (float)(num1 + num2 + num3)/3;
        System.out.println(average);

        sc.close();
    }
}
