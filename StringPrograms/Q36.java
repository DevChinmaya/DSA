//Q36: write a java program to find palindrome substring in a program? 
// Input: “Malayalam” 
//Output: ala, alayala, aya, layal, Malayalam
public class Q36 {
    public static void main(String[] args) {
        String s = "Malayalam";
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                if(isPallindrome(s,i,j)){
                    System.out.println(s.substring(i,j+1));
                }
            }
        }
    }
    public static boolean isPallindrome(String s,int start,int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

