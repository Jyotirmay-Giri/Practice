package DSA_Algorithims;

import java.util.Arrays;

public class TwoPointerReverse {
    public static void main(String[] args) {
        // Reverse an Array Using two pointer approach
        int[] arr = {1,2,3,4,5};
        System.out.println("Reversed Array ia : "+ Arrays.toString(reverseArr(arr)));


        // Reversed String Using Two pointer approach
        String str = "Jyotirmay";
        String ReveStr = new String(reverseString(str));
        System.out.println("Reverse String is : "+ReveStr);
    }

    static int[] reverseArr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }

    static char[] reverseString(String str){
        char[] charArr = str.toCharArray();
        int start = 0;
        int end = charArr.length-1;

        while(start<end){
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;

            start++;
            end--;
        }
        return charArr;
    }
}
