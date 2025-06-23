import java.util.*;

public class J01_Arrays {
    public static void main(String[] args) {

        // Creation
        // 1 way
        int marks[] = new int[20];
        // 2nd way
        int marks1[] = {98,99,100};

        // Input
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();

        // Output
        System.out.println(marks[0]);

        // Update
        marks[0] = 99;
        marks[1] = marks[0] + 1;

    }
}
