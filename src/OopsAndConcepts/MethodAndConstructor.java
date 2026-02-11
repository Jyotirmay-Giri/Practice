package OopsAndConcepts;


class Student{
    String name;
    int age;
//    double amount;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
//        this.amount = amount;
    }

    void mark(){
        System.out.println("Total mark 560");
    }

    double fees(double amount){
        double sum = 1000 + amount;
        return sum;
    }


}

class myClass {
    static int square(int num) {
        return num * num;
    }

}


public class MethodAndConstructor {
    public static void main(String[] args) {
        Student S = new Student("Jyotirmay",28);
        S.mark();
        System.out.println(S.fees(30000));

        System.out.println(myClass.square(3));

    }
}
