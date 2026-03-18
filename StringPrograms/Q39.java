//Q39: write a java program to swap two string variables without using third variable?
public class Q39 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        s1 = s1 + s2; // s1 now contains "HelloWorld"
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
    }
}
