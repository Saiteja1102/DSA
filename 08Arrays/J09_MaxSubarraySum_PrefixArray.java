public class J09_MaxSubarraySum_PrefixArray {
    public static void maxSubArraySum(int arr[]){
        int prefixArray[] = new int[arr.length];

        // Calculate PrefixArray
        prefixArray[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefixArray[i] = prefixArray[i-1] + arr[i];
        }


        int sum = 0;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<prefixArray.length;i++){
            int start = i;
            sum = arr[i];
            if(largest < sum){
                largest = sum;
            }
            for(int j=i+1;j<prefixArray.length;j++){
                int end = j;
                sum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[start-1];
                if(largest < sum){
                    largest = sum;
                }
                sum = 0;
            }
            sum = 0;
        }
        System.out.println("Maximum Sum = " + largest);
    }
    public static void main(String[] args){
        int arr[] = {1,-2,6,-1,3};
        maxSubArraySum(arr);
    }
}
