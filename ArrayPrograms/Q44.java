//Remove elements present before the given index
//I/P: {3,2,1,6,9,8,5}; idx=3;
//O/P: {6,9,8,5};
import java.util.Arrays;

public class Q44 {
    public static void main(String[] args) {
        int[]a={3,2,1,6,9,8,5};
        int idx=3;
        if(idx<0 || idx>=a.length){
            System.out.println("Invalid Index Number");
            return;
        }
        int n=0;
        int res[]=new int[a.length-idx];
        for(int i=idx; i<a.length; i++){
            res[n++]=a[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
