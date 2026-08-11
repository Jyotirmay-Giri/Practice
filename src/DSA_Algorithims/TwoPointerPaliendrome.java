package DSA_Algorithims;

public class TwoPointerPaliendrome {
    public static void main(String[] args) {

        // Identify given sting/single word is paliendrome or not
        String strA = "abccba";
        System.out.println(solutionA(strA));

        //Identify given string/sentence is paliendrome or not.
        String strB = "A man a plan a canal Panama";
        System.out.println(solutionB(strB));

        // Converting char arr to string
        char[] A = {'a','b','c'};
        String s = new String(A);

        System.out.println(s);
    }

    static boolean solutionA(String strA){
        char[] arrA = strA.toCharArray();
        int start = 0;
        int end = arrA.length-1;

        while(start < end){
            if(arrA[start] == arrA[end]){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }

    static boolean solutionB(String strB){
        char[] arrB = strB.toCharArray();
        int start =0;
        int end = arrB.length-1;

        while(start < end){
//          Here we are checking only alphanumeric characters.
            if(!Character.isLetterOrDigit(arrB[start])){
                start++;
                continue;

            } else if (!Character.isLetterOrDigit(arrB[end])) {
                end--;
                continue;

            } else if (Character.toLowerCase(arrB[start]) != Character.toLowerCase(arrB[end])) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
