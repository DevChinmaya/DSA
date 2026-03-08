//Q23: input: “ccaabbd” output: “aabbccd” (sort given string)?

import java.util.Arrays;

public class Q23 {
    public static void main(String[] args) {
        String s="ccaabbd";
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }
}
