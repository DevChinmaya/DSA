//Reverse every element of the array
//[23,55,64,72,89,54,2]
//[32,55,46,27,98,45,2]
import java.util.*;
public class Q28 {
    public static void main(String[] args) {
        int[]a={23,55,64,72,89,54,2};
        for(int i=0; i<a.length; i++){
            a[i]=reverse(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            rev = rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
}
