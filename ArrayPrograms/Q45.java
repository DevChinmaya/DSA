
import java.util.Arrays;

public class Q45 {
    public static void main(String[] args) {
        int a[]={3,5,7,6,8,2};
        int[] b = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(b));
    }
}
