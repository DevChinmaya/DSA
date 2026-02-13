public class towerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        solve('S','H','D',n);
    }
    static void solve(char s, char d, char h, int n){
        if(n == 1){
            System.out.println("Move disk 1 from "+ s +" to "+ d );
            return;
        }
        solve(s,h,d,n-1);

        System.out.println("Move disk " + n + " from "+ s +" to " + d);
        solve(h,d,s,n-1);
    }
}
