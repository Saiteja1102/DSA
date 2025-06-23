public class J02_InvertedAndRotated {

    public static void InvertedAndRotated(int lines){
        // outer
        for(int i=1; i<=lines; i++){
            // spaces
            for(int j=1; j<=lines-i; j++){
                System.out.print("  ");
            }

            // stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedAndRotated(5);
    }
}
