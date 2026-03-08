//Q24: write a java program to print substring of a string 
// Input: "Malayalam"
//Output: Every possible substring of the input should be printed
//TC:O(n^3)
public class Q24 {
    public static void main(String[] args) {
        String s = "Prem";
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
