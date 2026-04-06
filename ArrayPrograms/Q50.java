
import java.util.Arrays;

//Bubble Sort
//Pick the biggest ele and push towards the end
public class Q50 {
    public static void main(String[] args) {
        int a[]={2,1,4,9,-3,8};
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
