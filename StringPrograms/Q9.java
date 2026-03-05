//Q9: input:” Ramana” output:” R@m@n@”?

public class Q9 {
    public static void main(String[] args) {
        String s="Ramana";
        char []ch = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                ch[i] = '@';
            }else{
                ch[i] = s.charAt(i);
            }
        }
        System.out.println(print(ch));
        //or
        //System.out.println(Arrays.toString(ch));
    }
    public static String print(char[] ch){
        String result = "[";
        for(int i=0; i<ch.length-1; i++){
            result += ch[i] +", ";
        }
        return result + ch[ch.length-1] + "]" ;
    }
}
