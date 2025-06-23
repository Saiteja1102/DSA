/*
Solid Rhombus
    *****
   *****
  *****
 *****
*****  
*/

public class J07_SolidRhombus {
    public static void SolidRhombus(int n){
        // outer
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        SolidRhombus(5);
    }
}
