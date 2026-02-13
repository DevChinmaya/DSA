//Union of two sorted arrays
//Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.
//The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.

import java.util.*;

public class UnionOfArray {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> s = new TreeSet<>();
        int n1 = nums1.length;
        int n2 = nums2.length;    
        for(int i=0; i<n1; i++){
            s.add(nums1[i]);
        }
        for(int i=0; i<n2; i++){
            s.add(nums2[i]);
        }
        int[] unionArray = new int[s.size()];
        int idx=0;
        for(int val: s){
            unionArray[idx++] = val;
        }
        return unionArray;
    }
}