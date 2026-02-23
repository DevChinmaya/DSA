
//Given a string consiting of both num and chars , return the sum of all the num present in the string
public class demo1 {
    public static void main(String[] args) {
        String s = "s2h34j33l";
        int sum=0;
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)-'0'<=9) && (s.charAt(i)-'0'>=0)){
                sum += s.charAt(i)-'0';
            }
        }
        System.out.println(sum);
    }
}
