import java.util.Arrays;

public class Q52 {
    public static void main(String[] args) {
        int a[]={2,1,4,9,-3,8};
        for(int i=0; i<a.length; i++){
            int minIndex=i;
            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[minIndex]){
                    minIndex=j;
                }
            }
            int temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=a[minIndex];
        }
        System.out.println(Arrays.toString(a));
    }
}
