
import java.util.Scanner;

public class J10_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("num1 + num2 is " + (num1+num2));
                break;
            case '-':
                System.out.println("num1 - num2 is " + (num1-num2));
                break;
            case '*':
                System.out.println("num1 * num2 is " + (num1*num2));
                break;
            case '/':
                System.out.println("num1 / num2 is " + (num1/num2));
                break;
            case '%':
                System.out.println("num1 % num2 is " + (num1%num2));
                break;
            default:
                System.out.println("Enter corect operator");
        }

    }
}
