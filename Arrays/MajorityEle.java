//Majority Element-I
//Given an integer array nums of size n, return the majority element of the array.The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

//Optimal Soln
import java.util.*;
class MajorityEle {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}



//BruteForce

// class MajorityEle {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
        
//         for(int i=0; i<n; i++){
//             int count=0;
//             for(int j=0; j<n; j++){
//                 if(nums[j] == nums[i]){
//                     count++;
//                 }
//             }
//             if(count>(n/2)){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }