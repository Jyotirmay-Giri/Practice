package Learning_A;

import java.util.*;

public class ArmstrongNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println(isArmstrongNo(n));

    }

    static boolean isArmstrongNo(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n/10;

        }
        if (original == sum){
            return true;
        }else{
            return false;
        }
    }



}
