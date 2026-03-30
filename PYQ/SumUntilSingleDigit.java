// Given a number n, find the sum of its digits until the sum becomes a single digit.

public class SumUntilSingleDigit {
    public static void main(String[] args) {
        int n=12345;
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
        System.out.println(sum);
    }
    public static int DigitsSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
