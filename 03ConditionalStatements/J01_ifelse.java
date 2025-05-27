public class J01_ifelse {
    public static void main(String[] args) {
        int age = 16;
        if (age > 18){
            System.out.println("Vote and Drive");
        }
        if (age >= 16 && age <= 18 ){
            System.out.println("Teeneger");
        }
        else{
            System.out.println("You are not adult");
        }
    }    
}
