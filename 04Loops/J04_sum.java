// 1 to n -> sum

import java.util.Scanner;

public class J04_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
