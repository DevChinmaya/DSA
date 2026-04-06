import java.util.Arrays;
//Merge Sort
public class Q53 {
    public static void main(String[] args) {
        int a[]={2,1,4,9,-3,8};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[]a){
        if(a.length == 1) return ;
        int left[]=new int[a.length/2];
        int right[]=new int[a.length-left.length];
        for(int i=0; i<a.length; i++){
            if(i<left.length) left[i]=a[i];
            else right[i-left.length]=a[i];
        }
        sort(left);
        sort(right);
        merge(left, right, a);
    }
    public static int[] merge(int[] left,int[] right,int c[]){
        int i=0,j=0,idx=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){   
                c[idx++]=left[i++];
            }else{
                c[idx++]=right[j++];
            }
        }
        while(i<left.length){
            c[idx++]=left[i++];
        }
        while(j<right.length){
            c[idx++]=right[j++];
        }
        return c;
    }
}
