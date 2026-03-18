//Q38: write a java program smallest substring palindrome in a given string?
public class Q38 {
    public static void main(String[] args) {
        String s = "Malayalam";
        String result="";
        int minCount=Integer.MAX_VALUE;
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                if(isPallindrome(s,i,j)){
                    if(s.substring(i,j+1).length() < minCount){
                        result = s.substring(i,j+1);
                        minCount = result.length(); 
                    }
                }
            }
        }
        System.out.println(result);
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
