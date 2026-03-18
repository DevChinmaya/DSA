//Q46: Write a java program to check two strings are Anagram or not without replace method
public class Q46 {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        System.out.println(isAnagram(s1, s2));
        
    }
    //Optimized method using visited array to keep track of the characters that have been matched in the second string.
    public static boolean isAnagram(String s1,String s2){
        int i=0;
        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return false;
        }
        boolean visited[] = new boolean[s2.length()];
        while(i<s1.length()){
            int j=0;
            boolean flag=false;
            while(j<s2.length()){
                if(s1.charAt(i) == s2.charAt(j) && !visited[j]){
                    visited[j] = true; 
                    flag=true;
                    break;
                }
                j++;
            }
            if(!flag){
                return false;
            }
            i++;
        }
        return true;
    }
    //By sorting the character array and then comparing them.
    // public static boolean isAnagram(String s1,String s2){
    //     int i=0;
    //     if(s1.length()!=s2.length()){
    //         return false;
    //     }
    //     char ch[] = s1.toCharArray();
    //     char ch1[] = s2.toCharArray();
    //     Arrays.sort(ch);
    //     Arrays.sort(ch1);
    //     return Arrays.equals(ch, ch1);
    // }
}



    //Logically not correct because if there are duplicate characters in string then it will not work. 
    // public static void main(String[] args) {
    //     String s1="listen";
    //     String s2="silent";
    //     int i=0;
    //     if(s1.length() != s2.length()){
    //         System.out.println("Not Anagram");
    //         return;
    //     }
    //     while(i<s1.length()){
    //         char ch = s1.charAt(i);
    //         int j=0;
    //         while(j<s2.length()){
    //             if(ch == s2.charAt(j)){ 
    //                 break;
    //             }
    //             j++;
    //         }
    //         if(ch != s2.charAt(j)){
    //             System.out.println("Not Anagram");
    //             return;
    //         }
    //         i++;
    //     }
    //     System.out.println("Anagram");
    // }

