import java.util.Scanner;

public class kThSymbol {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        if(k>(int)Math.pow(2,n-1)){
            return ;
        }
        int result = solve(n,k);
        
        System.out.println(result);
    }
    public static int solve(int n, int k){

        if(n==0 || k==1){
            return 0;
        }
        int mid = (int) Math.pow(2,n-1)/2;

        if(k <= mid){
            return solve(n-1, k);
        }else{
            return solve(n-1,k-mid) == 0 ? 1 : 0;
        }

    }
}
