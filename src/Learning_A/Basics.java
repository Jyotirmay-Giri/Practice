package Learning_A;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello World");
// ............................................................. 1
        int a = 10;
        int b = 40;
        int c = 55;

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

        //................................................. 2

        String s = "Jyotirmay ";
        System.out.println(s.trim().charAt(8));

        //..................................................... 3
// N th number in fibonachi series.
        int p = 0;
        int q = 1;

        int n = 7;

        int count = 2;

        while(count <= n){
            int temp = q;
            q = p+q;
            p = temp;
            count ++;
        }
        System.out.println(q);

    }
    //..................................................................4

        

}
