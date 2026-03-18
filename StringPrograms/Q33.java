//Q33: write a java program to split given array and store the result into string array without using split ()?
public class Q33 {
    public static void main(String[] args) {
        String s = "This is a java program";
        int count=1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        String[] arr = new String[count];
        int start=0, index=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                arr[index++]=s.substring(start,i);
                start=i + 1;
            }
        }
        arr[index] = s.substring(start);
        for(String s1:arr){
            System.out.print(s1+" ");
        }
    }
}
