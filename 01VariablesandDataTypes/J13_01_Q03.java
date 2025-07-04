/*
Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */

import java.util.Scanner;

public class J13_01_Q03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of eraser: ");
        float eraser = sc.nextFloat();
        // float total = pencil + pen + eraser;

        System.out.println("----------Bill----------");
        System.out.println("Pencil = "+pencil);
        System.out.println("GST = "+(pencil)*(0.18f));
        System.out.println("Pen = "+pen);
        System.out.println("GST = "+(pen)*(0.18f));
        System.out.println("Eraser = "+eraser);
        System.out.println("GST = "+(eraser)*(0.18f));
        System.out.println("-------------------------");
        System.out.println("Total Price = "+((pencil+(pencil)*(0.18f)) + (pen+(pen)*(0.18f)) + (eraser+(eraser)*(0.18f))));
        System.out.println("-------------------------");

        sc.close();
    }
}
