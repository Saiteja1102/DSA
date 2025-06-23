public class J04_ProductOf2 {
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int product = multiply(a, b);
        System.out.println("a * b = " + product);
        product = multiply(9, 20);
        System.out.println("a * b = " + product);
    }
}
