public class J09_PrimeorNot {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i == 0){
                isPrime = false;
            }
        }

        return isPrime;
    }

    public static boolean optimizedisPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean isPrime = isPrime(3);
        if(isPrime == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

        System.out.println(optimizedisPrime(4));
    }
}
