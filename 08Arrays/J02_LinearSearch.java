public class J02_LinearSearch {

    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,7,12,10,18,19,22};
        int key = 18;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Key Not found");
        } else{
            System.out.println("Key found at index : "+index);
        }
    }
}
