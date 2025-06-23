/*
Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321. 
*/

public class J15_06_Q03 {
    
    public static int reverse(int n){
        int reverse = 0;
        while(n > 0){
            int lastDigit = n % 10;
            reverse = lastDigit + (reverse * 10);
            n /= 10;
        }
        return reverse;
    }

    public static void isPalindrome(int n){
        if(n == reverse(n)){
            System.out.println("Palindrome...");
        } else{
            System.out.println("Not a Palindrome");
        }
    }
    public static void main(String[] args) {
        isPalindrome(321);
    }
}
