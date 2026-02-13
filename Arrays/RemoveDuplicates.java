// Remove duplicates from sorted array
// Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once.Return the number of unique elements in the array.
import java.util.*;
//Optimal Approach
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        for(int j=1; j<n; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}

//Brute Force
// class RemoveDuplicates {
//     public int removeDuplicates(int[] nums) {
//         Set<Integer> s = new TreeSet<>();
//         for(int val:nums){
//             s.add(val);
//         }
//         int cnt=0;
//         for(int val:s){
//             nums[cnt++] = val;
//         }
//         return cnt;
//     }
// }