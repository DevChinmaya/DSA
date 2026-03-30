//Write a program ehich will return first character that does not repeat
//I/P: aababbacdde
//O/P: c
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s="aababbacdde";
        char ch[] = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            int count=1;
            for(int j=i+1; j<ch.length; j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j] = ' ';
                }
            }
            if(count == 1 && ch[i]!=' '){
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println(-1);
    }
}
