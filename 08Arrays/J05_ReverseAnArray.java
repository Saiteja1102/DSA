public class J05_ReverseAnArray {

    public static void reverseArray(int arr[]){
        int first = 0, last = arr.length - 1;

        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        reverseArray(numbers);
        //Output
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
