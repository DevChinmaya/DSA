//Find missing number
//Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.

//Optimal Approach
class FindMissingNum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumN = (n*(n+1))/2;
        int sumA=0;
        for(int i=0; i<n; i++){
            sumA += nums[i];
        }
        return sumN-sumA;
    }
}


//BetterApproach
// class FindMissingNum {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int[] freq = new int[n+1];

//         for(int i=0; i<n; i++){
//             freq[nums[i]]++;
//         }
//         for(int i=0; i<n+1; i++){
//             if(freq[i] == 0) return i;
//         }
//         return -1;
//     }
// }


//BruteForce
// class FindMissingNum {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         if(n==0) return 0;
//         Arrays.sort(nums);
//         int count=0;
//         for(int i=0; i<n; i++){
//             if(nums[i] != count){
//                 return count;
//             }
//             count++;
//         }
//         return n;
//     }
// }