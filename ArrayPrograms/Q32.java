//Shift Zeros to right side of array

import java.util.Arrays;

public class Q32 {
    public static void main(String[] args) {
        int a[]={3,2,0,2,0,3,4,8,0,7,0};
        for(int i=0;i<a.length; i++){
            if(a[i]==0){
                int j=i+1;
                while(j<a.length){
                    if(a[j]!=0){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                        break;
                    }   
                    j++;              
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
