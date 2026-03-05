//Q11: write a java program to print vowel character in a string?

public class Q11 {
    public static void main(String[] args) {
        String s = "rejsidaaiio";
        String vowel="aeiou";
        for(char c: s.toCharArray()){
            if(vowel.indexOf(c)!=-1){
                System.out.print(c);
            }
        }
    }
}
