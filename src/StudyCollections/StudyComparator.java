package StudyCollections;

import java.util.ArrayList;
import java.util.Comparator;

public class StudyComparator {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(7);

//        list.sort(new MyClass()); // Using the class MyClass

//         Or Another way we can use lambda without using extra comparator class
        list.sort((a,b) -> b - a); // Using Lambda

        System.out.println(list);


    }

}
// This class helps to sort elements to sort welements in ascending/decending order.
class MyClass implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2; // If o1-o2 -> descending order
    }
}
