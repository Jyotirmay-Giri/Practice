package Learning_A;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 6, 12, 66, 77, 81, 90, 92, 99};
        int target = 92;

        System.out.println("Our target element is in index : " + solution(arr,target));
    }

    static int solution(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;


        boolean isAsc;
            if(arr[start] < arr[end]){
                isAsc = true;
            }else{
                isAsc = false;

            }

            while (start <= end) {
                int middle = start + (end - start) / 2;

                if (target == arr[middle]) {
                    return middle;
                }

                if (isAsc) {
                    if (target > arr[middle]) {  // Serching in right side
                        start = middle + 1; // assigning new start index

                    } else { // searching in left side
                        end = middle - 1; // assigning new end index

                    }

                } else {
                    if (target > arr[middle]) {
                        end = middle - 1;
                    } else {
                        start = middle + 1;
                    }

                }


            }
            return -1;
    }

}
