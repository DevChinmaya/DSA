//Q12: write a java program to maximum occurrence character and its count in a string?
//Input: ramana output: a=3?
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        String s = "ramana";
        int max=0;
        char maxChar=' ';
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i), 0)+1);
            if(max < hs.get(s.charAt(i))){
                max = hs.get(s.charAt(i));
                maxChar = s.charAt(i);
            }
        }
        System.out.println(maxChar + "="+max);
    }
}

