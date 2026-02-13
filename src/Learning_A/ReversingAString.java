package Learning_A;

public class ReversingAString {
    public static void main(String[] args) {
        String S = "Jyotirmay";

        System.out.println("Reversed value of string S : " + reverse(S));
    }

    public static String reverse(String S){
        char[] arr = S.toCharArray();

        int start =0;
        int end = arr.length-1;

        while (start< end){
            char temp = arr[start];
            arr[start] = arr[end];
             arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }
}
