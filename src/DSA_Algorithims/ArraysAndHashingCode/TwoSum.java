package DSA_Algorithims.ArraysAndHashingCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,11};
        int target = 8;
       System.out.println(Arrays.toString(sol(arr, target)));
    }

    static int[] sol(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int val = target - arr[i];

            if(map.containsKey(val)) {
                return new int[]{
                        map.get(val), i
                };
            }
                map.put(arr[i],i);
            }
            return new int[]{};
        }

    }


