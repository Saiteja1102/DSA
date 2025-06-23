public class J08_FunctionOverloadingUsingDataTypes {

    // fun to call int sum
    public static int sum(int a, int b){
        return a + b;
    }

    // fun to call float sum
    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,3));
        System.out.println(sum(3.8f,4.2f));
    }
}
