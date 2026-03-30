import java.util.Arrays;

public class MoveZerosEnd {
    public static void main(String[] args) {
        int a[] = {3, 0, 1, 2, 0, 3, 0, 12};
        int i=0, j=a.length-1;
        while(i<j){
            if(a[i] == 0 && a[j] == 0){
                j--;
            }else if(a[i] == 0 && a[j] != 0){
                int temp=a[i];
                a[i] = a[j];
                a[j] = temp;
                i++; j--;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
