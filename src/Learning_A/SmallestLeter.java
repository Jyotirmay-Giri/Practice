package Learning_A;

public class SmallestLeter {
    public static void main(String[] args){
        char[] arr = {'c','d','f','j'};
        char target = 'f';

        System.out.println(sol(arr,target));

    }

    static char sol(char[] arr,char target){
        int start = 0;
        int end = arr.length-1;

        while(end >= start){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }else{
                start = mid + 1;

            }
        }
        return arr[start % arr.length];
    }
}
