//Write a program to find the length of array without using length attribute?
public class Q34 {
    public static void main(String[] args) {
        int a[]={1,2,4,5,6};
        System.out.println(findLength(a));
        System.out.println(findLengthUsingException(a));
        
    }
    //Using Exception Handling
    public static int findLengthUsingException(int[]a){
        int count=0;
        while (true) { 
            try{
                int temp=a[count];
                count++;
            }catch(Exception e){
                break;
            }
        }
        return count;
    }
    //Using For-Each Loop 
    public static int findLength(int[]a) {
        int count=0;
        for(int n:a){
            count++;
        }
        return count;
    }
}
