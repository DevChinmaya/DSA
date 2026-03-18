import java.util.Arrays;
public class FindAllNum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,4,5,2,5,4,6,7};
        int[] arr2 = {1,7,5,2,3,5,4,9};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        boolean flag=true;
        int i = 0;
        int j = 0;
        while(i<arr.length && j<arr2.length){
            if(arr[i] == arr2[j]){
                i++;
                j++;
            }else if(arr[i] < arr2[j]){
                i++;
            }else{
                flag=false;
                break;
            }
        }
        if(j != arr2.length){
            flag = false;
        }   
        System.out.println(flag);
    }
}
