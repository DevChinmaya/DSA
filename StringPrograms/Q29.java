//Q29: Write a java program to check two strings are Panagram or not?

import java.util.*;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        if(isPangram(sc.nextLine())){
            System.out.println("Panagram");
        }else{
            System.out.println("Not Panagram");
        }
    }
    public static boolean isPangram(String s){
        s = s.toLowerCase();
        Set<Character> st = new HashSet<>();
        for(char ch: s.toCharArray()){
            st.add(ch);
        }
        return st.size() == 26;
    }
}

