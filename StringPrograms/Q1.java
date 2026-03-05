

//Q1: write a java program to reverse a string
public class Q1 {
    public static void main(String[] args) {
        String s = "abcde";
        char ch[] = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(ch));
    }
}
