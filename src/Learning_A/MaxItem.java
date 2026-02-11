package Learning_A;
import java.util.*;

public class MaxItem {
    public static void main(String[] args){

        int[] arr = {2,55,6,2,56,66};

        System.out.println("Max element is : " + maxVal(arr));
        System.out.println("Max element in range is : " + maxValRange(arr,1,4));

    }


    static int maxValRange(int[] arr,int start,int end){
        int max = arr[0];
        for(int i=start;i<end;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


    static int maxVal(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
