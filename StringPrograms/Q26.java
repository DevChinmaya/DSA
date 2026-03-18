//Q26: write a java program to find missing alphabet in a string ? 
//Input: “abc” output:”d e f g h I j k l……….”
public class Q26 {
    public static void main(String[] args) {
        String s = "abc";
        boolean[] check=new boolean[26];//Every value is false by default
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                check[ch-'a']=true;//Mark all the char that are present in the string as true
            }
        }
        for(int i=0; i<check.length; i++){
            if(!check[i]){//then return all the chars that are not present int string(false)
                System.out.print((char)(i+'a')+" ");
            }
        }
    }
}
