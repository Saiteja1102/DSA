import java.util.*;

public class J08_inputSum {
    public static void main(String args[]){
        // Create a sc object of scanner class
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

        sc.close();
    }
}
