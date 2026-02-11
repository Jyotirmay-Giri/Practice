package StudyCollections;

import java.util.Arrays;
import java.util.LinkedList;

public class StudyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(6);
        list.add(18);
        list.add(14);
        list.add(71);
        System.out.println(list);
        list.removeIf(x -> x % 7 == 0);
        System.out.println(list);
        System.out.println(list.get(2));

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Tiger","Lion","Dog","Cat","Monkey"));

        System.out.println(animals);
    }
}
