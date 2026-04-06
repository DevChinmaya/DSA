//Print missing elements betw 1 to n
// I/P: {2,3,5,7,9,13};
// O/P:{1,4,6,8,10,11,12}
public class Q41 {
    public static void main(String[] args) {
        int[]a={2,3,5,7,9,13};
        // {1,4,6,8,10,11,12}
        int n=a[a.length-1];
        int idx=0;
        for(int i=1; i<=n; i++){
            if(i == a[idx])idx++;
            else System.out.print(i+" ");
        }
    }
}
