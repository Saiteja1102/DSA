/*
Floyd's Triangle
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

public class J04_FloydsTrianglePattern {

    public static void Floyd(int n){
        int count = 1;
        // outer
        for(int i=1; i<=n; i++){
            // inner
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Floyd(5);
    }
}
