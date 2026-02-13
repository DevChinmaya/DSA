
//Leaders in an Array
// Given an integer array nums, return a list of all the leaders in the array.
// A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.
import java.util.*;
class LeadersInArray {
    public List<Integer> leaders(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        int cnt=0;
        for(int i=0; i<n; i++){
            int j;
            for(j=i+1; j<n; j++){
                if(nums[i] <= nums[j]){
                    break;
                }
            }
            if(j==n){
                res.add(nums[i]);
            }         
        }
        return res;
    }
}