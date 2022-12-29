package hashing;

/*
Find whether an array is subset of another array

Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a subset of arr1[] or not.
Both arrays are not in sorted order. It may be assumed that elements in both arrays are distinct.

Examples:

Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1}
Output: arr2[] is a subset of arr1[]

Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4}
Output: arr2[] is a subset of arr1[]

Input: arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3}
Output: arr2[] is not a subset of arr1[]
 */

import java.util.HashSet;
import java.util.Set;

public class SubsetArray {

    public static boolean IsSubset(int[] arr1, int[] arr2, int m, int n){
        Set<Integer> hset = new HashSet<>();
        //adding all elements of array 1 to hashset
        for(int i=0 ;i<m; i++){
            if(!hset.contains(arr1[i])){
                hset.add(arr1[i]);
            }
        }

        for(int i=0; i < n ; i++){
            if(!hset.contains(arr2[i])){
                return false;
            }
        }
       return true;
    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{10, 5, 2, 23, 19};
        int[] arr2 = new int[]{19, 5, 3};
        int m = arr1.length;
        int n = arr2.length;

        if(IsSubset(arr1,arr2,m,n)){
            System.out.println("arr2[] is subset of arr1[]");
        } else{
            System.out.println("arr2[] is not a subset of arr1[] ");
        }
    }
}
