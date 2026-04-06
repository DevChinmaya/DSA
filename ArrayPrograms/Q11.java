//Write a java program to print prime numbers present in an given array
//I/P: {1,2,3,4,5,6}
//O/P: {2,3,5}

public class Q11 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        for(int i=0; i<a.length; i++){
            if(isPrime(a[i]))System.out.print(a[i]+" ");
        }
    }
    public static boolean isPrime(int n){
        if(n<=1)return false;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0)return false;
        }
        return true;
    }
}
