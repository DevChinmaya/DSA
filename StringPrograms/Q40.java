//Q40: input: “acb243d10” output:243+10=253? 
public class Q40 {
    public static void main(String[] args) {
        String s = "acb243d10";
        int num=0;
        int sum=0;
        for(int i=0; i<s.length(); i++){  
            if(s.charAt(i) >= '0' && s.charAt(i)<='9'){
                num = num*10 + (s.charAt(i)-'0');
            }else{
                sum += num;
                num=0;
            }
        }
        sum += num;
        System.out.println(sum);
    }
}
