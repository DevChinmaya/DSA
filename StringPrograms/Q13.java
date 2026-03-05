
import java.util.HashMap;

//Q13: write a java program to minimum occurrence character and its count in a string? 
// Input: ramana output: r=1
public class Q13 {
    public static void main(String[] args) {
        String s = "rrraammannnika";
        int mini=Integer.MAX_VALUE;
        char minChar = ' ';
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            hs.put(c,hs.getOrDefault(c, 0)+1);
        }
        for(HashMap.Entry<Character,Integer> entry: hs.entrySet()){
            if(mini > entry.getValue()){
                mini = entry.getValue();
                minChar = entry.getKey();
            } 
        }
        System.out.println(minChar + "=" + mini);
    }
}