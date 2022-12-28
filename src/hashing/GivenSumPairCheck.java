package hashing;

/*
Check if a pair exists with given sum in given array

Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x.

Examples:
Input: arr[] = {0, -1, 2, -3, 1}, x= -2
Output: Yes
Explanation:  If we calculate the sum of the output,1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}, x = 0
Output: No


 */

import java.util.HashSet;
import java.util.Set;

public class GivenSumPairCheck {

    private static boolean IsGivenSumPairCheck(int[] arr, int target){
       Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i<arr.length ; i++){
            int complement = target - arr[i];
            if(set.contains(complement)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[] = new int[]{0, -1, 2, -3, 1};
        int target = -2;
        System.out.println(IsGivenSumPairCheck(arr,target));

    }
}
