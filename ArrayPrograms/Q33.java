
import java.util.Arrays;

//Shift Zeros to right
public class Q33 {
    public static void main(String[] args) {
        int[]a={0,3,0,5,0,4,3,4,9,0};
        for(int i=a.length-1; i>=0; i--){
            if(a[i]==0){
                int j=i-1;
                while(j>=0){
                    if(a[j]!=0){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                        break;
                    }
                    j--;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
