public class J04_BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            // Comparisons
            if(arr[mid] == key){
                return mid;
            } else if(key < arr[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int binS = binarySearch(numbers, key);
        System.out.println("Key is at index : "+binS);
    }
}
