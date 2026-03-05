//7: write a java program to find index value “ash123” where key=’s’?
public class Q7 {
    public static void main(String[] args) {
        String s="ash123";
        char key='s';
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == key){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
