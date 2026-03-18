//Q32: write a java program to find occurrence of a character in a string using replace method?
public class Q32 {
    public static void main(String[] args) {
        String s = "This is a java program";
        char ch='a';
        int count = s.length() ;
        String res = s.replace(String.valueOf(ch),"");
        int length = res.length();
        System.out.println(count-length);
    }
}