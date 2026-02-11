package Revision;

import java.util.HashMap;
import java.util.Map;

public class RevisionMap {
    public static void main(String[] args) {
        HashMap<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"Jyoti");
        myMap.put(4,"Rahul");
        myMap.put(5,"Jagat");
        myMap.put(19,"Jitu");
        myMap.put(13,"Lit");

        System.out.println(myMap);

//         iterating through the map

        for (Map.Entry<Integer, String> integerStringEntry : myMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " = " +integerStringEntry.getValue());
        }

        myClass student = new myClass("Jyoti",28);
        System.out.println(student);

    }

}
//  Creating a class
 class myClass{
    String name;
    int age;
    // creating a constructor.............
    public myClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


