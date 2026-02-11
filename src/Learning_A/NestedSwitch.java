package Learning_A;
import java.util.*;

public class NestedSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id :");
        int EmpId = sc.nextInt();

        switch (EmpId) {
            case 1 -> System.out.println("Jyotirmay");
            case 2 -> System.out.println("Harish");
            case 3 -> System.out.println("Rajesh");
            case 4 -> {
                System.out.println("Enter department :");
                String department = sc.next();
                switch (department) {
                    case "IT" -> System.out.println("IT team");
                    case "Dev" -> System.out.println("Developer team");
                    case "Tester" -> System.out.println("Tester team");
                }
            }
            default -> System.out.println("Enter valod value");
        }
        }

    }


