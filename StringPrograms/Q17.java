//Q17: input: “java is very easy” output: avaj si yrev ysae”
public class Q17 {
    public static void main(String[] args) {
        String s = "java is very easy";
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            StringBuilder revWord = new StringBuilder(word);
            sb.append(revWord.reverse()).append(" ");                                                                             
        }
        System.out.println(sb.toString().trim());
    }
}
