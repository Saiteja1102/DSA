/*
Inverted HALF PYRAMID PATTERN
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/

public class J03_Inverted_HalfPyramidPattern {

    public static void InvertedHalfPyramid(int n){
        // outer
        for(int i=1; i<=n; i++){
            // inner
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedHalfPyramid(5);
    }
}
