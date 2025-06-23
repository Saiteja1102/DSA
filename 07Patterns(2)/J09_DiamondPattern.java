/*
Diamond Pattern
    *
   ***
  *****
 *******
*********  
********* 
 *******
  *****
   ***
    *

*/


public class J09_DiamondPattern {

    public static void DiamondP(int n){
        // outer 1st half
        for(int i=1; i<=n/2; i++){
            // space
            for(int j=1; j<=(n/2)-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // outer 2nd half
        for(int i=n/2; i>=1; i--){
            // space
            for(int j=1; j<=(n/2)-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DiamondP(6);
    }
}
