//Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:
//Every consecutive pair of integers have opposite signs.For all integers with the same sign, the order in which they were present in nums is preserved.
//The rearranged array begins with a positive integer.

class RearangeEleBySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int pcnt=0, ncnt=0;
        for(int i=0; i<n; i++){
            if(nums[i] >= 0){
                pos[pcnt] = nums[i];
                pcnt++;
            }else{
                neg[ncnt] = nums[i];
                ncnt++;
            }
        }
        pcnt=0;
        ncnt=0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                res[i] = pos[pcnt];
                pcnt++;
            }else{
                res[i] = neg[ncnt];
                ncnt++;
            }
        }
        return res;
    }
}