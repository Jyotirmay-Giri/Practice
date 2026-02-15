package PracticeString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetingCharacter {
    public static void main(String[] args) {

//    First Non-Repeating Character
//
//    Input: "aabbcddce"
//    Output: "e"

        String S = "hhookkjwwppqh";

        System.out.println(characteris(S));

    }

    static Character characteris(String S){
        LinkedHashMap<Character,Integer> myHash = new LinkedHashMap<>(); // Using LinkedHashMap bcz it's stores data in sequence.
        for(int i =0;i<S.length();i++){
            char ch = S.charAt(i);
            // Storing the characters and it's count
            if(myHash.containsKey(ch)){
                myHash.put(ch,myHash.get(ch)+1);
            }else{
                myHash.put(ch,1);
            }

        }
        System.out.println(myHash);

        // Returning our result
        for (Map.Entry<Character, Integer> Entry : myHash.entrySet()) {
            if(Entry.getValue() == 1){
                return Entry.getKey();
            }
        }
        return null;
    }

}
