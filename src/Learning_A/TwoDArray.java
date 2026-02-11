package Learning_A;
import java.util.*;

public class TwoDArray {
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of row : ");
        int n = sc.nextInt();
        System.out.print("Enter size of collum : ");
        int m = sc.nextInt();


        int arr[][] = new int[n][m];

        for(int row =0;row<arr.length;row++){

            for(int col =0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }

        }
        for(int row =0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
