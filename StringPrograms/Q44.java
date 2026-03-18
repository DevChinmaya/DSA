//Q44: Write a java program to find the occurrence of character from given String with replace method?

public class Q44 {
    public static void main(String[] args) {
        String s="hello woooorld";
        char ch = 'o';
        int count = s.length()-s.replace(ch+"","").length();
        System.out.println(ch+" is present "+count+" times in the string");
    }
}
