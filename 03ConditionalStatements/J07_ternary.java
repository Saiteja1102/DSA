// ternary Operator
// variable = condition ? statement1 : statement2;

import java.util.Scanner;

public class J07_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String type1 = ((num%2)==0) ? "Even" : "Odd";
        System.out.println(type1);
        
        sc.close();
    }   
}
