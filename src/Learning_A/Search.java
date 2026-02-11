package Learning_A;
import java.util.*;

public class Search {
    public static void main(String[] args){
        String s = "Jyotirmay";
        char target = 'r';
        System.out.println(find(s,target));
    }
    static boolean find(String s,char target){
        for(int i =0;i<s.length();i++){
            if(target == s.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
