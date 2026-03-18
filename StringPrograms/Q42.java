//Q42: Write a java program to remove space in given String without using inbuilt function?
public class Q42 {
    public static void main(String[] args) {
        String s = "he llo world";
        String result="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                result += s.charAt(i);
            }
        }
        System.out.println();
    }
}
