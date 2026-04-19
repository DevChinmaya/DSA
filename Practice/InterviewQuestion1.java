import java.util.Scanner;
public class InterviewQuestion1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String input[]=sc.nextLine().split(" ");
        int a[]=new int[input.length];
        for(int i=0; i<n; i++){
            a[i]=Integer.parseInt(input[i]);
        }
        int maxCount=0;
        int replace=Integer.MAX_VALUE;
        int ele=0;
        for(int i=0; i<a.length; i++){
            int count=1;
            if(a[i]!=replace){
                for(int j=i+1; j<a.length; j++){
                    if(a[i]==a[j]){
                        count++;
                        a[j]=replace;
                    }
                }
                if(count>maxCount){
                    maxCount=count;
                    ele=a[i];
                }
            }        
        }
        System.out.println();
        System.out.println(ele);
    }
}
