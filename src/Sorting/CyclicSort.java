package Sorting;

import java.util.Arrays;

public class CyclicSort {

    // Cyclic sort can be used where it's given array is from 1 to N..
    public static void main(String[] args) {
        int[] arr = {7,3,5,1,6,2,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i =0;
        while (i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
