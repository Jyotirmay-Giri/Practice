package Learning_A;

public class PerformXOR {
    public static void main(String[] args) {
        // Find unique element in an array
        int[] arr = {1,2,4,1,2};

        // a ^ a = 0 and a ^ b = 1

        int result =0;
        for(int a : arr){
//            result = result^a;
            result^=a;
        }
        System.out.println("Unique element is : " + result);

    }

}

