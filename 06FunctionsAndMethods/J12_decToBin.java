public class J12_decToBin {

    public static void decToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int bin = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            bin = bin + (rem * (int)Math.pow(10,pow)); 
            pow++;
            decNum /= 2;
        }

        System.out.println("Binary Num of "+myNum+" is "+bin);
    }
    public static void main(String[] args) {
        decToBin(7);
        decToBin(8);
    }
}
