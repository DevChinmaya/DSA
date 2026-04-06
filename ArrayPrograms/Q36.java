//Insert 5 in index 3
// a[]={1,2,3,4}; key=5; pos=3;
import java.util.Arrays;

public class Q36 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int key=5;
        int pos=3;
        int b[]=new int[a.length + 1];
        int idx=0;   
        for(int i=0; i<a.length;i++){
            if(i==pos)b[idx++]=key;
            b[idx++]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
