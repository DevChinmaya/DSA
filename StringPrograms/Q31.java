//Q31: write a java program to print missing vowels in a string
public class Q31 {
    public static void main(String[] args){
        String s = "This is a ";
        s = s.toLowerCase();
        String vowels = "aeiou";
        for(char ch: vowels.toCharArray()){
            if(s.indexOf(ch)==-1){
                System.out.print(ch+" ");
            }
        }
    }
}