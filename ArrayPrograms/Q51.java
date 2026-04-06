import java.util.Arrays;
//Insertion Sort
public class Q51 {
    public static void main(String[] args) {
        int a[]={2,1,4,9,-3,8};
        for(int i=1; i<a.length; i++){
            int ele=a[i];
            int j=i-1;
            while(j>=0 && a[j]>ele){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=ele;
        }
        System.out.println(Arrays.toString(a));
    }
}
