//Q6: write a java program to print sum of number present in a string?
//Input:” ash123” output: 6 
public class Q6 {
    public static void main(String[] args) {
        String s = "ash123";
        int sum=0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                sum+=s.charAt(i)-'0';
            }
        }
        System.out.println(sum);
    }
}
