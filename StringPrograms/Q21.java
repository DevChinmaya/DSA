//Q21: input: “easy very is java” output: “java is very easy”
public class Q21 {
    public static void main(String[] args) {
        String s = "java is very easy";
        String[] res = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=res.length-1; i>=0; i--){
            sb.append(res[i]);
            if(i>0) sb.append(" ");//This is done here to avoid extra space after the last word
        }
        System.out.println(sb.toString());
    }
}
