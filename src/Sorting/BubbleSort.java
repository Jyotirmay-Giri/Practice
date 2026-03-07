package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={4,2,6,1,7,3,99,5};
        bubble(arr);
        System.out.println("Sorter Array is : " + Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i =0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                // swap
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }


}
