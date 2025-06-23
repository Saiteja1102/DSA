// Using helper function i.e creating factorial function

public class J06_binCoeff {

    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int binCoeff = n_fact / (r_fact * nmr_fact);
        return binCoeff;
    }

    public static void main(String[] args) {
        int coeff = binCoeff(5, 2);
        System.out.println("Binomial Coeff = " + coeff);
    }
}
