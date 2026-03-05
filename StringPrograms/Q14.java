
import java.util.HashMap;

//Q14: Given a string , print the same char If it appears first time → print the character...If it appears again → print its occurrence count so far
// input: helloworld output: he121w2r3d?
public class Q14 {
    public static void main(String[] args) {
        String s = "helloworld";
        HashMap<Character,Integer> hs = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            hs.put(ch, hs.getOrDefault(ch, 0)+1);
            if(hs.get(ch) == 1){
                sb.append(ch);
            }else{
                sb.append(hs.get(ch));
            }
        }
        System.out.println(sb.toString());
    }
}
