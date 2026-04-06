//Sum of each element until single digit
//I/P: {33,23,55,23,4,22,1};
//O/P: {6,5,1,5,4,4,1}

import java.util.Arrays;

public class Q25 {
    public static void main(String[] args) {
        int a[]={33,263,55,23,4,22,1};
        for(int i=0; i<a.length; i++){
            a[i] = SumUntilSingleDigit(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }
    public static int SumUntilSingleDigit(int n){
        int sum=0;
        while(n>0 || sum>9){
            if(n==0){
                n=sum;
                sum=0;
            } else {
                sum+=n%10;
                n/=10;
            }
        }
        return sum;

        // while(n>0){
        //     sum+=n%10;
        //     n/=10;
        // }
        // int fsum=0;
        // while(sum>9){
        //     fsum+=sum%10;
        //     sum/=10;
        // }
        
        // return sum;
    }
}
