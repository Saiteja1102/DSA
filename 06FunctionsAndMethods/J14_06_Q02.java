/*
Question 2 : Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.
*/

public class J14_06_Q02 {

    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        if(isEven(6)){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}
