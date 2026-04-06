public class Q57 {
    public static void main(String[] args) {
        char ch[]={'R','A','C','D','B'};
        for(int i=0; i<ch.length-1; i++){
            for(int j=i+1; j<ch.length; j++){
                if(ch[i]>ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }         
        }
        System.out.println(ch);
    }
}
