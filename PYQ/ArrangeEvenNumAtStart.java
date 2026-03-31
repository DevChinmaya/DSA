//Arrange array such that all even num come first and then odd number but in original order
// I/P:{2,1,4,3,6,5,7}
// O/P:{2,4,6,1,3,5,7}
import java.util.*;
public class ArrangeEvenNumAtStart{
    public static void main(String[] args) {
        int[] a={2,1,4,3,6,5,7};
        int res[]=new int[a.length];
        int idx=0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0) res[idx++]=a[i];
        }
        for(int i=0; i<a.length; i++){
            if(a[i]%2!=0) res[idx++]=a[i];
        }
        System.out.println(Arrays.toString(res));
    }
}






    //This will not maintain order of even and also odd elements
    // public static void main(String[] args) {
    //     int[] a={2,1,4,3,6,5,7};
    //     int i=0,j=1;
    //     while(i<a.length && j<a.length){
    //         if(a[i]%2==0 && a[j]%2!=0){
    //             int temp=a[i];
    //             a[i]=a[j];
    //             a[j]=temp;
    //             i++; j++;
    //         }
    //         else if(a[i]%2==0) i++;
    //         else if(a[i]%2!=0 && a[j]%2!=0) j++;
    //     }
    //     System.out.println(Arrays.toString(a));
    // }
