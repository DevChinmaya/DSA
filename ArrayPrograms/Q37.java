import java.util.Arrays;

public class Q37 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int pos=2;
        int b[]=new int[a.length - 1];
        int idx=0;   
        for(int i=0; i<a.length;i++){
            if(i==pos)continue;
            b[idx++]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
