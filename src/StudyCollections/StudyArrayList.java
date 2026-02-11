package StudyCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudyArrayList {
    public static void main(String[] args){
        List<String> Words = Arrays.asList("Banana","Orange","Cherryy","Watermelon","Appleeee");
//        Words.sort(new StringLentComparator());

        // Or Another way we can use lambda without using extra comparator class
        Words.sort((a,b) -> a.length()-b.length());
        System.out.println(Words);
    }
}
class StringLentComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();// Shorts in ascending order according to length of each words.
        return o2.length()-o1.length(); // Shorts in descending order according to length of each words.
    }
}

