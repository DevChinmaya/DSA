
import java.util.Arrays;

//Write a program to return sum of even digits of a number in the array
public class Q30 {
    public static void main(String[] args) {
        int a[]={322,413,657,8865,9322};
        for(int i=0; i<a.length; i++){
            a[i]=SumOfEvenDigits(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }
    public static int SumOfEvenDigits(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            if(d%2==0) sum+=d;
            n/=10;
        }
        return sum;
    }
}
