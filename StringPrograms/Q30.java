//Q30: Write a java program to check two strings are Anagram or not?
import java.util.*;
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings: ");
        
        if(isAnagram(sc.next(), sc.next())){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");  
        }
    }
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int count[] = new int[26];
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}
