//There are two unsorted arrays which have duplicate and common ele in them.Write a program to print the ele from both the arrays 
// in sorted and distinct manner.
// a={1,2,4,5,1,1}; b={3,7,4,5,6,1,6,6};
// res={1,2,3,4,5,6,7};
import java.util.*;
public class DistinctTwoArrayEle {
    public static void main(String[] args) {
        int[] a={1,2,4,5,1,1};
        int[] b={9,9,9,3,1,4,5,4,7,6,6,6,6,6};
        int[] res=new int[a.length+b.length];
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        int idx=0;
        while(i<a.length && j<b.length){
            if(i<a.length-1 && a[i] == a[i+1]){
                i++;
                continue;
            }else if(j<b.length-1 && b[j]==b[j+1]){
                j++;
                continue;
            }

            if(a[i] < b[j]){
                res[idx++]=a[i];
                i++;
            }else if(a[i] > b[j]){
                res[idx++]=b[j];
                j++;
            }else if(a[i] == b[j]){
                res[idx++]=a[i];
                i++;
                j++;
            }
        }
        while(i<a.length){
            if(i<a.length-1 && a[i] == a[i+1]){
                i++;
                continue;
            }else{
                res[idx++]=a[i];
                i++;
            }
        }
        while(j<b.length){
            if(j<b.length-1 && b[j]==b[j+1]){
                j++;
                continue;
            }else{
                res[idx++]=b[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
        // for(int k=0; k<res.length; k++){
        //     if(res[k]!=0) System.out.print(res[k]+" ");
        // }
    }
}
