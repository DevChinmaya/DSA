//Q49:write a java program to remove edge space using trim()?
//Input:”__java _is _easy__? Output: “java is easy”?
public class Q49 {
    public static void main(String[] args) {
        String s = "  java  is   easy ";
        removeSpace(s);
        // for(int i=0; i<s.length()-1; i++){
        //     if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
        //         System.out.print(s.charAt(i+1));
        //     }
        // }
    }
    public static void removeSpace(String s){
        String result=s.trim().replaceAll("\\s+", " ");
        System.out.println(result);
    }
}