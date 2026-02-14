package PracticeString;

public class Paliendrom {
    public static void main(String[] args) {
//        Question :
//        Check Palindrome (Without using reverse() method)
//        Input: "madam"
//        Output: true


        String S = "madaml";

//        if(S.equals(solution(S))){
//            System.out.println("Given String is paliendrome" );
//        }else{
//            System.out.println("Given String is not a paliendrome" );
//        }

        // Approach 2

        if(!isPaliendrome(S)){
            System.out.println("Given String is Not a Paliendrome");
        }else {
            System.out.println("Given String is Paliendrome");
        }


    }

    static String solution(String S){
        char[] arr = S.toCharArray();
        int start = 0;
        int end = arr.length-1;

        while(start < end){

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);

    }

    // Optmized approach
    static boolean isPaliendrome(String S){
        int start = 0;
        int end = S.length()-1;
        while(start<end){
            if(S.charAt(start) != S.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
