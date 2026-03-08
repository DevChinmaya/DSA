//Q19: write a java program to change upper case to lower case?
public class Q19 {
    public static void main(String[] args) {
        String s = "NabssyaUNdn";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(Character.toLowerCase(s.charAt(i)));
        }
        System.out.println(sb.toString());
    }
}
