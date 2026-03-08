//Q20: input: Ramana 
//Output: R Ra Ram Rama Raman Ramana
public class Q20 {
    public static void main(String[] args) {
        String s = "Ramana";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(s.charAt(i));
            System.out.println(sb.toString());
        }
    }
}
