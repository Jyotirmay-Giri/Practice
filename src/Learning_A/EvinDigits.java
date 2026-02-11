package Learning_A;

public class EvinDigits {
    // Finding even digits in elements of an array
    // Ex- 3 here (11,4564,22)
    public static void main(String[] args){
        int[] arr = {11,2,345,4564,22,678,1};

        System.out.println(solution(arr));
    }
    static int solution(int[] arr){
        int count = 0;
        int ans = 0;

        for(int i =0;i< arr.length;i++){
            int num = arr[i];
            int a = numbers(num,count);
            if(a % 2 == 0){
                ans++;
            }

        }
        return ans;
    }

    static int numbers(int num,int count){
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }

}
