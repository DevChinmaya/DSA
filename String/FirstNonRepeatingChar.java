//Find the first non repeating character in a string
import java.util.LinkedHashMap;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "aabbccdebsw";
        LinkedHashMap<Character,Integer> hs = new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++){
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(hs.containsKey(s.charAt(i)) && hs.get(s.charAt(i))==1){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
