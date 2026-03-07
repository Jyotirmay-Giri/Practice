package PracticeString;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "jitu";
        String t = "tiju";

        System.out.println(solution(s,t));

    }


    static boolean solution(String s, String t){
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        if(Arrays.equals(ch1,ch2)) {
            return true;
        }else {
            return false;
        }
    }
}
