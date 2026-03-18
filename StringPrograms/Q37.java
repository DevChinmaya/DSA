//Q37: input: “happy happy birthday  output: “happy birthday”? 
public class Q37 {
    public static void main(String[] args) {
        String s = "happy happy birthday";
        String[] arr = s.split(" ");
        String result = "";
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                
            }else{
                System.out.print(arr[i]+" ");
            }
        }
    }
}