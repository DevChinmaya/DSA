//Q27: input:”3124” output:3124 without using parseInt
public class Q27 {
    public static void main(String[] args) {
        String s = "3129";
        int num=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int n=ch-'0';
            num = num*10 + n;
        }
        System.out.println(num);
    }
}
