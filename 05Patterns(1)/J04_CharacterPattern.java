/*
Character Pattern
A
B C
D E F
G H I J

*/

public class J04_CharacterPattern {
    public static void main(String[] args) {
        int lines = 5;
        char ch = 'A';
        for(int line=1; line<=lines; line++){
            for(int i=1; i<=line; i++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
