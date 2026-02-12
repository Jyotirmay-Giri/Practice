package Revision;


class myThread extends Thread{

    @Override
    public void run(){
        System.out.println("Sum is : " + sum(2,5));
        System.out.println("Multiplication is : " + multiplication(3,5));

    }
    static int sum(int a,int b){
//        System.out.println(a+b);
        return a+b;
    }
    static float multiplication(int x,int y){
        return x*y;
    }
}

public class LearnThread {
    public static void main(String[] args) {
        myThread t = new myThread();
        t.start();
//        System.out.println();

    }
}
