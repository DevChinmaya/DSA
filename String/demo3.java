
//Write a program that takes a string as input and replaces each character with the next vowel in alphabetical order.
public class demo3 {
    public static void main(String[] args) {
        String s = "naDtPioi";
        String result = "";

        for (char ch : s.toCharArray()) {
            char lower = Character.toLowerCase(ch);
            result += nextVowel(lower);
        }

        System.out.println(result);
    }

    static char nextVowel(char ch) {
        String vowels = "aeiou";

        // If already a vowel → next vowel cyclic
        int index = vowels.indexOf(ch);
        if (index != -1) {
            return vowels.charAt((index + 1) % 5);
        }

        // If consonant → find next vowel in alphabet
        for (char c = ch; c <= 'z'; c++) {
            if (vowels.indexOf(c) != -1) {
                return c;
            }
        }

        // wrap around if no vowel found
        return 'a';
    }
}