//Q22: write a java program to print words in a given string, 
// input: “Java Is Very Easy”
// Output: 
//         Java 
//         Is 
//         Very 
//         Easy
public class Q22 {
    public static void main(String[] args) {
        String s = "Java Is Very Easy";
        String[] words = s.split(" ");
        for(String word:words){
            System.out.println(word);
        }
    }
}
