//Find the sum of two arrays and store it in another array?
//I/P: {3,2,2,1,4,5};
//     {6,4,6,2};
//O/P: {9,6,8,3,4,5};
import java.util.Arrays;

public class Q29 {
    public static void main(String[] args) {
        int a[]={3,2,2,1,4,5};
        int b[]={6,4,6,2};

        int min=a.length<b.length ? a.length : b.length;
        int max=a.length > b.length ? a.length : b.length;
        int c[]=new int[max];
        for(int i=0; i<min; i++){
            c[i]=a[i]+b[i];
        }
        if(a.length>b.length)
            for(int i=min; i<a.length; i++) c[i]=a[i];
        else   
            for(int i=min; i<b.length; i++) c[i]=b[i];
        
        System.out.println(Arrays.toString(c));
    }
}
