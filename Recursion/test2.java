class Solution {
    public static double myPow(double x, int n) {
      if(n == 0){
        return 1;
      }
      return x*myPow(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        double result = myPow(x, n);
        System.out.println(result);
    }
}