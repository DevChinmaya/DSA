//Q47: input: “ramana” output:”ramn” with indexOf method?
public class Q47 {
    public static void main(String[] args) {
        String s = "ramana";
        String result = "";
        for(int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i),0,s.length())==-1){
                
            }else{
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}