
//Q16: write a java program for initcap of string 
// input: india tHAt is bhARat 
// output: India That Is Bharat

public class Q16 {
    public static void main(String[] args) {
        String s = "inDia thAt is bHarat";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(i==0 || s.charAt(i-1) == ' '){    
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb.toString());
    }
}
