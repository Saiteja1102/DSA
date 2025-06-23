/*

Hollow Rhombus
    * * * * *
   *       *
  *       *
 *       *
* * * * *  

*/

public class J08_HollowRhombus {

    public static void HollowRhombus(int n){
        // outer
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // star
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        HollowRhombus(5);
    }
}
