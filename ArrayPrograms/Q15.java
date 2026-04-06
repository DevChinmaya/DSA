//Write a program to print the last occured index of a given element
// {1,2,9,3,9,4,9,6,7,8}
// 6
public class Q15 {
    public static void main(String[] args) {
        int[]a={1,2,9,3,9,4,9,6,7,8};
        int key=9;
        for(int i=a.length-1; i>=0; i--){
            if(a[i]==key){
                System.out.println(i);    
                return;       
            }
        }
        
    }
}
