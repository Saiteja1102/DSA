import java.util.Scanner;

public class J12_01_Q02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float side = sc.nextFloat();
        float area = side * side;
        System.out.println(area);

        sc.close();
    }
}
