/*
0-1 Triangle Pattern
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

public class J05_01TrianglePattern {

    public static void Triangle01(int n){
        // outer
        for(int i=1; i<=n; i++){
            // inner
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Triangle01(5);
    }
}
