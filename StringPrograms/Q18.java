//Q18: write a java program to print palindrome words in a string?
//Input: eye level car boy? output: eye, level
    
public class Q18 {
    public static void main(String[] args) {
        String s = "eye level car boy";
        String[] splitWords = s.split(" ");
        for(String word:splitWords){
            int left = 0;
            int right = word.length()-1;
            boolean flag = true;
            while(left<right){
                if(word.charAt(left) != word.charAt(right)){
                    flag=false;
                    break;
                }
                left++;
                right--;
            }
            if(flag) System.out.print(word+" ");
        }
    }
}
