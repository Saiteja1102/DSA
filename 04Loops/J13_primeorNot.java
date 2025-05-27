
import java.util.Scanner;

public class J13_primeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("Prime..");
        } else{
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n%i == 0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("Prime..");
            }
            else{
                System.out.println("Not a prime");
            }
        }
    }
}

// for the above the code runs n-2 times to optimize it we can run till sqrt(n) this is also correct as the numbers repeat
