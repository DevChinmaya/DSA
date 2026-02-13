//Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.

import java.util.Arrays;

public class MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    
}
