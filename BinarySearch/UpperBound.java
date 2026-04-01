public class UpperBound {
    public static void main(String[] args) {
        int a[]={3,5,8,15,19};
        int key=3;
        System.out.println(UBound(a, key));
    }
    public static int UBound(int[]a,int key){
        int n=a.length-1;
        int low=0,high=n;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>key){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }         
        }
        return ans;
    }
}
