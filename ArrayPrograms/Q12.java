//Write a java program to print vowels present in array
//{a,b,c,d,e,o}
//{a,e,o}
public class Q12 {
    public static void main(String[] args) {
        char[]ch={'a','b','c','d','e','o'};
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'|| ch[i]=='o' || ch[i]=='u'){
                System.out.print(ch[i]+" ");
            }
        }
    }
}
