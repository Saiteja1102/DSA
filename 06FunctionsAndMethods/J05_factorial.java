public class J05_factorial {
    public static int factorial(int n){
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int factorial = factorial(4);
        System.out.println(factorial);
        System.out.println(factorial(7));
    }
}
