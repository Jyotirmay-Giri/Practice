package Learning_A;

public class TargetInFiniteArray {
    public static void main(String[] args) {
        // Find the target Element in an Infinite Array

        int[] arr = {1,2,3,4,5,6,78,9,12,14,27,33,47,49,50,57,68,90,92,100};
        int target = 90;

//        System.out.println(binarySearch(arr,target));
        System.out.println(ans(arr,target));

    }

    static int ans(int[] arr, int target){
       int start = 0;
       int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start+1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
