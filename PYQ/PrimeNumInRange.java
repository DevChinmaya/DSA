import java.util.*;
public class PrimeNumInRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        range(l,r);
    }
    public static void range(int l,int r){
        if(l>r) return;
        if(isPrime(l)){
            System.out.print(l+" ");
        }
        range(l+1,r);
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
