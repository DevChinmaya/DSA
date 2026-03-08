 // 1) Write a function to reverse a given string without
 // using built-in methods like reverse().
 
 /* class ReverseString{
    public static String Reverse(String str){
         String result = "";
         for(int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
         }
         return result;
    }
    public static void main(String args[]){
        String str = new String("Hello");
        System.out.println(Reverse(str));
    }
 } */

// 2) Check if a String is Palindrome
 /* class Palindrome{
    public static boolean isPalindrome(String str){
        str = str.replaceAll("[^a-zA-Z]","").toLowerCase();
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) !=  str.charAt(str.length()-1-i)){
                return false;
            }
        }return true;
    }
    public static void main(String args[]){
        String str = "A man,A plan,A canal, panama";
        System.out.println(isPalindrome(str));
    }
 } */

// 3) Write a function that counts how many times a
// specific character appears in a string.
/* class charOccurence{
    public static int Occurence(String str,char character){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == character){
                count++;
            }
        }return count;

    }
    public static void main(String args[]){
       // String str = "My name is Prem";
       // char character = 'm';
        System.out.println(Occurence("My name is Prem",'m'));
    }
} */


// 4) Write a function that removes all duplicate characters 
//from a string.
/* class removeDuplicate{
    public static void removeDup(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length(); i++){
             for(int j=i+1; j<sb.length(); j++){
                if(sb.charAt(i) == sb.charAt(j)){
                    sb.deleteCharAt(j);
                    j--;//it is used cause in StringBuilder after deletion of a char it shrinks
                    // by 1 char to the left, if we will not use j-- then we will skip 1 char
                }
             }
        }
        System.out.println(sb.toString());
    }
    public static void main(String args[]){
        String str = "aaabbbccc";
        removeDup(str);
    }
}
 */


// 5)  Write a function to find the first non-repeating character
// in a string.
/* class NonRepeatingChar{
    public static char nrChar(String str){
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
               return str.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String args[]){
        String str = "geeksforgeeks";
        System.out.println(nrChar(str));
    }
} */


// 6)  Write a function that checks if two strings are anagrams 
// (i.e., they contain the same characters with the same frequency).
/* import java.util.*;
class AnagramCheck{
    public static boolean areAnagrams(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        return Arrays.equals(str1Arr, str2Arr);
       // return str1Arr.equals(str2Arr);
    }

    public static void main(String args[]){
        System.out.println(areAnagrams("anagram","nagaram"));
    }
} */


// 7) Write a function to replace all occurrences of a 
// character in a string with another character.
/* class ReplaceChar{
   public static String rChar(String s,char ochar,char nchar){
       return s.replace(ochar,nchar);
   }
   public static void main(String args[]){
       System.out.println(rChar("hello world",'o','x'));
   }
} */


// 8)  Write a function to count the number of words in a string.
// Assume that words are separated by spaces.
/* class CountWords{
    public static int cWords(String s){
        String words[] = s.split("\\s+");
        return words.length;
    }
    public static void main(String args[]){
       System.out.println(cWords("This is a text based on CP."));
    }
} */


// 9)  String Substring with Pattern Matching
/* class SubstringSearch{
    public static int findSubstring(String s,String p){
       return s.indexOf(p);
    } 
    public static void main(String args[]){
       System.out.println(findSubstring("hello world","world"));
    }
} */

// 10) Given a string, reverse the words in it
//  (maintain the order of the words).
/* class ReverseWords{
    public static String reverseWords(String s){
        String str[] = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length - 1; i>=0; i--){
           sb.append(str[i]);
           sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String args[]){
        String s = "the sky is pink";
        System.out.println(reverseWords(s));
    }
} */

// 11) Reverse the characters of a string 
/* class ReverseChar{
    public static void revChar(String s){
        char[] ch = s.toCharArray();
        int start=0;
        int end = ch.length-1;
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
         System.out.println(ch);  
    }
    public static void main(String args[]){
        String s = "The sky is pink";
        revChar(s);
    }
}
 */


// 12)  Count the Number of Vowels in a String
/* class VowelsCount{
    public static int countVowels(String s){
       int count = 0;
       char ch[] = s.toCharArray();
       for(int i=0; i<ch.length; i++){
          if(ch[i] == 'a' || ch[i] == 'e' || ch[i] =='i'|| ch[i] == 'o'|| ch[i] == 'u'){
              count++;
           }
       }
       return count;
    }
    public static void main(String args[]){
        String s = "Count the number of vowels present in this line";
        System.out.println(countVowels(s));
    }
} */

//13) Print the words in the para which contains 2 a's.
/* class TwoDuplicateA{
    public static void main(String args[]){
        String paragraph = "java is a versatile programming language";
        String words[] = paragraph.toLowerCase().split("\\s+");
       
        for(String word : words){
             int count = 0;
            for(int i=0; i<word.length(); i++){
               if(word.charAt(i) == 'a'){
                count++;
               }
            }
            if(count == 2){
                System.out.println(word);
            }
        }
    }
}
 */
