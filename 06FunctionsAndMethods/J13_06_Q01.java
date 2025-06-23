/*
Question 1 : Write a Java method to compute the average of three numbers.. 
*/

public class J13_06_Q01 {
    public static int average(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        System.out.println(average(5, 6, 8));
    }
}
