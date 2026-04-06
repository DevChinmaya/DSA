//Write a java program to convert -1 to 0 and 0 to -1
//I/P: {0,2,-1,0,2,-1,3}
//O/P: {-1,2,0,-1,2,0,3}

import java.util.Arrays;

public class Q24 {
    public static void main(String[] args) {
        int a[]={0,2,-1,0,2,-1,3};
        for(int i=0; i<a.length; i++){
            if(a[i]==0) a[i]=-1;
            else if(a[i]==-1) a[i]=0;
        }
        System.out.println(Arrays.toString(a));
    }
}
