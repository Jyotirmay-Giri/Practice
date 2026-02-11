package Learning_A;

import com.sun.source.tree.BreakTree;

public class CellingElement {
    // Celling element mean element just/recent most grater(celing >= target) element then target element.
//     we have floor = greatest number which is smaller oe = to target no

    public static void main(String[] args){
        int[] arr = {1,3,4,6,7,9,12,17,18,20,25,28,30,32,35,40};
        int target = 21;
//        int ans =0;

        System.out.println("Target element is in the index of :" + indexofTarget(arr,target));
//        System.out.println("Celing element is  :" + sol(arr,mid));

    }

    static int indexofTarget(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid-1;
            }else{
                return mid;
            }

        }
        return start;
//        similarly for floor element we need to return end here.
    }

//    static int sol(int[] arr, int inde){
//        int celing = arr[mid-1];
//        return celing;
//    }






}
