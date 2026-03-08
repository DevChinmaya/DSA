//Q25: input: “ramana” output: rmn?
public class Q25 {
    public static void main(String[] args) {
        String s = "ramana";
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                System.out.print(s.charAt(i));
            }
        }
    }
}
