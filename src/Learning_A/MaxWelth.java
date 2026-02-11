package Learning_A;
import java.util.*;



public class MaxWelth {
    public static void main(String[] args){
        // Find maximum value of sum of the array in 2d array.
        // Ex- here -> 2+4+6 = 12 maxValue .
        int[][] arr ={
                {1,2,3},
                {2,4,6},
                {7,1,2}
        };

        System.out.println("Maximum value is : " + solution(arr));

    }

    static int solution(int[][] arr){

        int maxVal = Integer.MIN_VALUE;
        for(int row =0;row<arr.length;row++){
            int sum = 0;
            for(int col =0;col<arr[row].length;col++){
                sum = sum + arr[row][col];
            }
            maxVal=Math.max(sum,maxVal);
        }

        return maxVal;
    }


}
