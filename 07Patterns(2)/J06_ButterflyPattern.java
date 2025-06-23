/*

Butterfly Pattern
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *

*/

public class J06_ButterflyPattern {
    public static void Butterfly(int n){
        // outer
        // 1st half
        for(int i=1; i<=n/2; i++){
            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // space
            for(int j=1; j<=(n/2)-i; j++){
                System.out.print(" ");
            }
            // space
            for(int j=1; j<=(n/2)-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=n/2; i>=1; i--){
            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // space
            for(int j=1; j<=(n/2)-i; j++){
                System.out.print(" ");
            }
            // space
            for(int j=1; j<=(n/2)-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Butterfly(8);
    }
}
