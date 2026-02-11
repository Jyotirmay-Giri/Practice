
package Learning_A;
import java.util.*;

import static java.lang.System.in;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int ans = 0;

        while (true) {
            System.out.println("Please enter an Operator : ");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                break;

            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("Enter two numbers - ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                switch (op) {
                    case '+' -> ans = a + b;
                    case '-' -> ans = a - b;
                    case '*' -> ans = a * b;
                    case '%' -> ans = a % b;
                    case '/' -> {
                        if (b != 0) {
                            ans = a + b;
                        } else {
                            System.out.println("wrong input");
                        }
                    }
                    default -> {
                        System.out.println("Welcome to calculator");
                        continue;
                    }
                }

            }else{
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);

        }
    }
}
