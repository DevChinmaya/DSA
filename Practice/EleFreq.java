import java.util.HashMap;

public class EleFreq {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,2,1,3};
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            hs.put(arr[i],hs.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(hs);
    }
}
