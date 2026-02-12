package Revision;

class myMultiThread extends Thread{
    public void run(){
        int count =0;
        for(int i =1;i<10;i++){
            count++;
            System.out.println("Hayy im Thread ......... 2 " + count);
        }
    }
}

public class LearnMultithreading {
    public static void main(String[] args) {
        int num =0;

        for(int i = 0;i<10;i++){
            num++;
            System.out.println("Hayy im Thread ................ 1 " + num);
        }

        myMultiThread t = new myMultiThread();
        t.start();

    }
}
