
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CrypticNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int st = sc.nextInt();
        int end = sc.nextInt();
        range(st,end);
    }

    public static void range(int st,int end){
        if(st>end){
            return ;
        }
        Cryptic(st);
        range(st+1,end);
    } 
    public static void Cryptic(int n){
        if(n%7==0 && n%5 !=0 && Pallindrome(n) == false && nonRepeatedDigits(n)){
            System.out.print(n+" ");
        }
    }
    public static boolean Pallindrome(int n){
        int rev=0;
        int copy=n;
        while(n>0){
            int d = n%10;
            rev = rev*10 + d;
            n/=10;
        }
        if(rev == copy){
            return true;
        }
        return false;
    }
    public static boolean nonRepeatedDigits(int n){
        Set<Integer> st = new HashSet<>();
        int length=0;
        
        while(n>0){
            st.add(n%10);
            length++;
            n /= 10;
        }
        return st.size() == length;
    }
}
