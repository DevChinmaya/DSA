//Q45: Remove Extra space in given string
//Input:  java  is   very  easy  ?
//Output: “java is very easy”
public class Q45 {
    public static void main(String[] args) {
        String s = "  java  is   very  easy  ";
        s = s.trim().replaceAll("\\s+", " ");
        System.out.println(s);
    }
}
