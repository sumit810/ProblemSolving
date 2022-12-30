package hashing;

/*
Find the length of largest subarray with 0 sum

Given an array arr[] of length N, find the length of the longest sub-array with a sum equal to 0.

Examples:

Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23}
Output: 5
Explanation: The longest sub-array with elements summing up-to 0 is {-2, 2, -8, 1, 7}

Input: arr[] = {1, 2, 3}
Output: 0
Explanation: There is no subarray with 0 sum

nput:  arr[] = {1, 0, 3}
Output:  1
Explanation: The longest sub-array with elements summing up-to 0 is {0}
 */

import java.util.HashMap;
import java.util.Map;

public class MaxSubArraySumLengthZero {

    public static void findLengthMaximumSubArraySumZero(int arr[]){
            Map<Integer, Integer> hmap = new HashMap<>();
            int max_length = 0;
            int subArraySum = 0;
            for(int i = 0 ; i < arr.length ; i++){
                subArraySum += arr[i];

                if(subArraySum == 0){
                    max_length = i++;
                }
                //checking the required sum in the hashmap
                Integer previousIndex = hmap.get(subArraySum);
                //if its seen in hashmap, update the max length
                if(previousIndex != null) {
                    max_length = Math.max(max_length, i - previousIndex);
                } else{
                        hmap.put(subArraySum,i);
                    }
                }
                System.out.println("The maximum length of subarray with sum 0 is::" +max_length);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{15, -2, 2, -8, 1, 7, 10, 23};
        findLengthMaximumSubArraySumZero(arr);
    }
}
