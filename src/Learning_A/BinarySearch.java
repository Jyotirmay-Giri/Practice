package Learning_A;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 12, 66, 77, 81, 90, 92, 99};
        int target = 92;

//        int[] arr = {90, 83, 74, 66, 60, 59, 50, 40, 45, 33, 30, 20, 21, 11, 5};
//        int target = 60;

//        System.out.println("Targeted element is in the place of : " + binarySearch(arr, target));
//
//        System.out.println("Targeted B element is in the place of : " + binarySearchB(arrb, targetb));

        System.out.println("Our targeted element is in the index of : " + masterlogic(arr,target));

    }

    static int masterlogic(int[] arr,int target ){
        int start =0;
        int end = arr.length-1;
        int ans = 0;
        if(arr[start] >=  arr[end]){
            ans = binarySearchB(arr, target);
        }else{
          ans = binarySearch(arr, target);
        }
        return ans;
    }
// For descending order
    static int binarySearchB(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
    //    For Ascending order sorted  array
    static int binarySearch(int[] arr, int target) {
        int start = 0; // Start index
        int end = arr.length - 1;// last index

        while (start <= end) {
            int middle = start + (end - start) / 2; // middle index of array

            if (target > arr[middle]) {  // Serching in right side
                start = middle + 1; // assigning new start index

            } else if (target < arr[middle]) { // searching in left side
                end = middle - 1; // assigning new end index

            } else {
                return middle; // at the end we will get our element in any middle place.
            }
        }
        return -1; // if we don't find the element returning -1
    }

}
