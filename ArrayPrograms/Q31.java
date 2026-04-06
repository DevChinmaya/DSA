//Merge two arrays
import java.util.Arrays;

public class Q31 {
    public static void main(String[] args) {
        int[]a={1,2,3};
        int[]b={4,5,6};
        int c[]=new int[a.length+b.length];
        int idx=0;
        for(int i=0; i<c.length; i++){
            if(i<a.length)
                c[i]=a[i];
            else
                c[i]=b[idx++];
        }
        System.out.println(Arrays.toString(c));
    }
}
