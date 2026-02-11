package Learning_A;
import java.util.*;
import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements :");
        for(int i =0;i<n;i++){

            list.add(sc.nextInt());

        }


//        list.add(10);
//        list.add(11);
//        list.add(14);
//        list.add(105);



        System.out.println( "Size of list :- "+ list.size());

        System.out.println(list);
    }
}
