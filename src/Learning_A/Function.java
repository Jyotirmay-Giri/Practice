package Learning_A;
import java.util.*;

public class Function {
    public static void main(String[] args){

//        System.out.println("Sum of two numbers : " + sum());

        System.out.println("New sum value is :" + sum2(3,4));

    }

    static int sum2(int a,int b){

        int summ = a+b;
        return summ;

    }

    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no :");
        int num1 = sc.nextInt();
        System.out.print("Enter second no :");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        return sum;

    }

}
