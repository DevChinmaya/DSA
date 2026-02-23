//Write a program to print the min alphabet to max alphabet present in the String except the alphabets present in the string
// s = "string" 
// O/P: hjklmopq

public class demo2 {
    public static void main(String[] args) {
        String s = "string";
        int max=s.charAt(0);
        int min=s.charAt(0);
        int currMax=s.charAt(0);
        int currMin=s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1)>s.charAt(i)){
                currMax=s.charAt(i-1);
                currMin=s.charAt(i);
            }else{
                currMax=s.charAt(i);
                currMin=s.charAt(i-1);
            }
            max = Math.max(currMax,max);
            min = Math.min(currMin,min);
        }
        for(char ch = (char)min; ch<(char)max; ch++){
            if(!s.contains(ch+"")){
                System.out.print(ch);
            }
        }
    }
}
