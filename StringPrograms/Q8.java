
import java.util.HashMap;

//Q8: input: “AssmnAN” output: s=2, A=2, m=1, n=1, N=1?

public class Q8 {
    public static void main(String[] args) {
        String s = "AssmnAN";
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
            }else{
                hs.put(s.charAt(i),1);
            }
            //hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i), 0)+1); 
        }
        System.out.println(hs);

    }
}
