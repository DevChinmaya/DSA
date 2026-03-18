//Q41: input: “abc” output:97+98+99=294?
public class Q41 {
    public static void main(String[] args) {
        String s = "abc";
        int sum=0;
        for(int i=0; i<s.length(); i++){
            sum += s.charAt(i);
        }
        System.out.println(sum);
    }
}
