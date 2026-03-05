//Q5: write a java program to convert string to char array without using in build function?

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        String s="Apple";
        char[] ch = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            ch[i]= s.charAt(i);
        }
        // for(char c:ch){
        //     System.out.print(c+" ");
        // }
        System.out.println(Arrays.toString(ch));
    }
}
