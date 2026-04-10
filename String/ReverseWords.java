public class ReverseWords {
    public static void main(String[] args) {
        String s="This is a java program";
        int j=s.length()-1;
        int i=s.length()-1;
        String res="";
        while(j>=0){
            if(j==0 || s.charAt(j-1)==' '){
                int sp=j-1;
                for(int k=j; k<=i; k++){
                    res+=s.charAt(k);
                }
                res+=' ';
                i=sp-1;
            }
            j--; 
        }
        System.out.println(res);
    }
}
