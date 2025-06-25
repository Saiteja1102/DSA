public class J08_SubArraysSum_MaxMin {
    public static void subArrays(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            System.out.print(arr[start]+" ");
            sum += arr[start];
            System.out.print("Sum : "+sum);
            if(largest < sum){
                largest = sum;
            }
            if(smallest > sum){
                smallest = sum;
            }
            sum = 0;
            System.out.println();
            for(int j=i+1;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                }
                System.out.print("Sum : "+sum);
                if(largest < sum){
                    largest = sum;
                }
                if(smallest > sum){
                    smallest = sum;
                }
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Sum = "+largest);
        System.out.println("Minimum Sum = "+smallest);
    }
    public static void main(String[] args){
        int arr[] = {1,-2,6,-1,3};
        subArrays(arr);
    }
}
