// Call by value -> Java always uses call by value

public class J03_CallbyValue {
    public static void swap(int a, int b){
        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Function values..");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        swap(a, b);
        System.out.println("-----------------");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
