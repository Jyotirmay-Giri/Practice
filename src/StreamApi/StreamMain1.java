package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain1 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(10);
        myList.add(1);
        myList.add(30);
        myList.add(11);

//        List<Integer> List1 = List.of(1,3,5,3,6,2,6);
//        List<Integer> List1 = new ArrayList<>();
//        for(int i : myList){
//            if(i%2 == 0){
//                List1.add(i);
//            }
//        }
//        System.out.println(List1);

        List<Integer> newList = myList.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(newList);

        List<Integer> Lisst2 = myList.stream()
                .filter(n-> n>2)
                .collect(Collectors.toList());

        System.out.println(Lisst2);


    }
}
