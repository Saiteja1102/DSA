public class J03_largestSmallestInArray {

    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }

    public static int getSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        int largest = getLargest(numbers);
        System.out.println("Largest number is : "+largest);
        int smallest = getSmallest(numbers);
        System.out.println("Smallest number is : "+smallest);
    }
}
