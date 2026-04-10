//s="aabcccccabbaaa"
//a:2   b:1   c:5   a:1   b:2   a:3 
public class OccurenceOfEveryCharInString {
    public static void main(String[] args) {
        String s="aabcccccabbaaa";
        int count=1;
        for(int i=0; i<s.length(); i++){
            if(i==s.length()-1){
                
            }
            else if(s.charAt(i)==s.charAt(i+1)){
                count++;
                continue;
            }
            System.out.print(s.charAt(i)+":"+count+"   ");
            count=1;
        }
    }
}
