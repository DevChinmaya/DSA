
import java.util.Arrays;
import java.util.Scanner;

//Write a java program to insert even values in an array,the user will enter the values
//I/P: {1,4,2,5,6,9}
//O/P: {4,2,6}
public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the values u want to insert: ");
        int n=sc.nextInt();
        int[]a=new int[n];
        int idx=0;
        int count=0;
        for(int i=0; i<n; i++){
            int m=sc.nextInt();
            if(m%2==0){
                count++;
                a[idx++]=m;
            }
        }
        int[]res=new int[count];
        for(int i=0; i<count; i++){
            res[i] = a[i]; 
        }
        System.out.println(Arrays.toString(res));
    }
}
