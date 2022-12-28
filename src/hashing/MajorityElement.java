package hashing;

/*
MAJORITY ELEMENT
Given an integer array of size n, find all elements that appear more than n/3 times.
nums[] = {1,3,2,5,1,3,1,5,1}

 */

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    private static void findingMajorityElement(int[] arr){
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            }else{
                hmap.put(arr[i],1);
            }
        }
        System.out.println(hmap);

        for(Integer key: hmap.keySet()){
            if(hmap.get(key) > arr.length/3){
                System.out.println("Majority element:: " +key);
            }
        }


    }


    public static void main(String... s){

        int[] nums = new int[]{1,3,2,5,1,3,1,5,1};
        findingMajorityElement(nums);

    }

}

