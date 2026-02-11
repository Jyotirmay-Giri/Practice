package Revision;

public class OverLoading {


    static class implementation{
        public int sum(int x, int y){
            return x+y;
        }

        public int sum(int x,int y,int z){
            return x+y+z;
        }

        public String sum(String x, String y){
            return y;
        }

    }



    public static void main(String[] args) {
       implementation i = new implementation();

       System.out.println("First :" + i.sum(1,2));
       System.out.println("Second :" + i.sum("Jyoti","Shree"));
       System.out.println("Third :" + i.sum(2,55,7));




    }


}
