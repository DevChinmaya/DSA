public class LowerBound {
    public static void main(String[] args) {
        int[]a={3,5,8,15,19};
        int key=6;
        System.out.println(lBound(a,key));
    }
    public static int lBound(int[]a,int key){
        int ans=a.length;
        int low=0, high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>=key){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
