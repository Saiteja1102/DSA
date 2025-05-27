// 1 to n

import java.util.Scanner;

public class J03_number1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n){
            System.out.print(counter+" ");
            counter++;
        }

        System.out.println();
    }
}
