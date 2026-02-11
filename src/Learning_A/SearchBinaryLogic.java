package Learning_A;

public class SearchBinaryLogic {
    public static void main(String[] args){
        int[] arr = {1,2,4,6,12,66,77,81,90,92,99};
        int target = 92;

        int[] arrb ={90,83,74,66,60,59,50,40,45,33,30,20,21,11,5};
        int targetb =60;

        System.out.println("Targeted element is in the place of : " + binarySearch(arr,target));

        System.out.println("Targeted B element is in the place of : " + binarySearchB(arrb,targetb));

    }

    static int binarySearchB(int[] arrb,int targetb){
        int startb = 0;
        int endb = arrb.length-1;


        while(startb>= endb){
            int mid = startb + (endb-startb)/2;

            if (targetb > arrb[mid]) {
                endb =mid-1;
            } else if (targetb < arrb[mid]) {
                startb = mid+1;
            }else{
                return mid;
            }

            return mid;

        }
        return -1;

    }

// for Ascending order sorted  array
    static int binarySearch(int[] arr, int target){
        int start = 0; // Start index
        int end = arr.length-1;// last index

        while(start <= end){
            int middle = start + (end - start)/2; // middle index of array

            if(target > arr[middle]){  // Serching in right side
                start = middle + 1; // assigning new start index

            } else if (target < arr[middle]) { // searching in left side
                end = middle-1; // assigning new end index

            }else {
                return middle; // at the end we will get our element in any middle place.
            }
        }
        return -1; // if we don't find the element returning -1
    }
}
