//Intersection of two sorted arrays
//Given two sorted arrays, nums1 and nums2, return an array containing the intersection of these two arrays. Each element in the result must appear as many times as it appears in both arrays; that is, if an element appears x times in nums1 and y times in nums2, it should appear min(x, y) times in the result.
//The intersection of two arrays is an array where all values are present in both arrays.

import java.util.*;
//Optimal Soln
class IntersectionOfArray {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<Integer> intersect = new ArrayList<>();
        int i=0 , j=0;
        while(i<n1 && j<n2){
            if(nums1[i] > nums2[j]){
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                intersect.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[intersect.size()];
        for(int k=0; k<intersect.size(); k++){
            res[k] = intersect.get(k);
        }
        return res;
    }
}


//Brute Force
// class IntersectionOfArray {
//     public int[] intersectionArray(int[] nums1, int[] nums2) {
//         int n1 = nums1.length;
//         int n2 = nums2.length;
//         int[] flag = new int[nums2.length];
//         List<Integer> intersect = new ArrayList<>();
//         for(int i=0; i<n1; i++){
//             for(int j=0; j<n2; j++){
//                 if(nums1[i] == nums2[j] && flag[j] == 0){
//                     intersect.add(nums2[j]);
//                     flag[j] = 1;
//                     break;
//                 }
//             }
//         }
//         int[] ans = new int[intersect.size()];
//         for(int k = 0; k< intersect.size() ; k++){
//             ans[k] = intersect.get(k);
//         }
//         return ans;
//     }
// }