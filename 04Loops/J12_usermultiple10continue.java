
import java.util.Scanner;

public class J12_usermultiple10continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}
