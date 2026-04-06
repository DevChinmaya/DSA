//Write a program to shift half elements to right side of array
//I/P: {2,3,1,7,5,4,5,6};
//O/P: {5,4,5,6,2,3,1,7}
import java.util.Arrays;
public class Q40 {
    public static void main(String[] args) {
        int a[]={2,3,1,7,5,4,5,6};
        //{5,4,5,6,2,3,1,7}
        int n=a.length;
        int half=n/2;
        for(int i=0;i<half; i++){
            int temp=a[i];
            a[i]=a[half+i];
            a[half+i]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
