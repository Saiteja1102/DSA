
import java.util.Scanner;

public class J10_usermultiple10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
