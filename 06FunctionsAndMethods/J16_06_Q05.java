/*
Question 5 :
Write a Java method to compute the sum of the digits in an integer.
*/

public class J16_06_Q05 {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1216));
    }
}
