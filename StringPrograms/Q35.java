//Q35: write all permutation of string “abc” output: “abc”, “acb”, “bac”, “bca”, “cba”, “cab”? 

public class Q35 {
    // Recursive method to generate permutations
    public static void permute(String str, String ans) {
        // Base case: if string is empty, print the accumulated answer
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Remaining string after removing the chosen character
            String ros = str.substring(0, i) + str.substring(i + 1);
            // Recursive call
            permute(ros, ans + ch);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println("All permutations of \"" + s + "\":");
        permute(s, "");
    }
}
