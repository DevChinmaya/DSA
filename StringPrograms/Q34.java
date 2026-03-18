//Q34: create one string array, size=5, add 5 elements and print it in reverse order
public class Q34 {
    public static void main(String[] args) {
        String[] s = new String[5];
        s[0] = "Hello";
        s[1] = "World";
        s[2] = "Java";
        s[3] = "Programming";
        s[4] = "Language";

        for(int i=s.length-1; i>=0; i--){
            System.out.println(s[i]);
        }
    }
}
