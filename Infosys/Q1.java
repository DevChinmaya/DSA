//Return the string after removing one duplicate digit from the string such that the resuting string is maximum possible value
//1321
//321

//45262
//4562

import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        int fcount=0;
        int num=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==ch)fcount++;
            if(fcount!=2 || s.charAt(i)!=ch)
                num = num*10 + (s.charAt(i)-'0');
        }
        int lcount=0;
        int num2=0;
        int pos=1;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==ch)lcount++;
            if(lcount!=2 || s.charAt(i)!=ch){
                num2=num2 + (s.charAt(i)-'0')*pos;
                pos*=10;
            }
        }
        System.out.println(num>num2 ? num : num2);
    }
}