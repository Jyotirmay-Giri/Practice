package Learning_A;

public class Count {
    public static void main(String[] args){
        // find the count of a number

        int num = 3233637;

        int count = 0;

        while(num > 0){
            int rem = num % 10;
            if(rem == 3){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);

    }
}
