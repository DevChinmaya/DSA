//Q4: write a java program to find given string is palindrome or not?
public class Q4 {
    public static void main(String[] args) {
        String s = "anananan";
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println("Not a pallindrome");
                return;
            }  
            left++;
            right--;
        }
        System.out.println("It is a pallindrome");
    }
}
