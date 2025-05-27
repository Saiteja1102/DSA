/*
Half Pyramid Pattern
1
1 2
1 2 3
1 2 3 4

*/

public class J03_HalfPyramid {
    public static void main(String[] args) {
        int lines = 5;
        for(int line=1; line<=lines; line++){
            for(int i=1; i<=line; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
