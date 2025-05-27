// break -> to exit the loop

public class J09_break {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("I am out of the loop");
    }
}
