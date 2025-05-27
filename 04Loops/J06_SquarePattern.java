public class J06_SquarePattern {
    public static void main(String[] args) {
        System.out.println("Using For loop");
        for(int line=1; line<=4; line++){
            System.out.println("* * * *");
        }

        System.out.println("Using While loop");
        int line = 1;
        while(line <= 4){
            System.out.println("* * * *");
            line++;
        }
    }
}
