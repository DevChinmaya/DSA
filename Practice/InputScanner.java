import java.util.Arrays;
import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int key=sc.nextInt();
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String st[]=s.split(",");
        int a[]=new int[st.length];
        for(int i=0; i<st.length; i++ ){
            a[i]=Integer.parseInt(st[i]);
        }
        int count=0;
        for(int i=0; i<a.length; i++){
            if(key == a[i]){
                count++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(count);
    }
}
