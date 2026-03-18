// Q43: Write a java program to count number of characters available in each word of a given String? 
// Input:- “java is easy” Output:- java=4 is=2 easy=4
public class Q43 {
    public static void main(String[] args) {
        String s = "java is easy";
        String result="";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                result += s.charAt(i);
            }else{
                System.out.println(result+"="+result.length());
                result="";
            }
        }    
        System.out.println(result+"="+result.length());//For last word
    }
}
