//Linear Search in an array
public class Q46 {
    public static void main(String[] args) {
        int[]a={4,2,6,9,8,5};
        int key=9;
        for(int i=0; i<a.length; i++){
            if(a[i]==key){
                System.out.println("Index of key: "+i);
                return;
            }
        }
    }
}
