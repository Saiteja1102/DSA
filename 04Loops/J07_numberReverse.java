public class J07_numberReverse {
    public static void main(String[] args) {
        int n = 10899;
        int lastdigit;
        int reverse = 0;

        while (n>0){
            lastdigit = n % 10;
            n = n/10;
            reverse = (reverse * 10) + lastdigit;
        }

        System.out.println(reverse);
    }
}
