public class Q47 {
    public static void main(String[] args) {
        int[] a={1,4,5,6,7,9};
        int key=9;
        int st=0;
        int end=a.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(a[mid] == key){
                System.out.println(mid);
                return;
            }else if(a[mid]>key){
                end=mid-1;
            }else{   
                st=mid+1;
            }
        }
    }
}
