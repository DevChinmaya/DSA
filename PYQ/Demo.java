public class Demo {
    public static void main(String[] args) {
        int a[]={1,2,1,3,2,4,0,0,-1,-2,-1,-3,-4};
        int max=Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            int count=1;
            if(a[i]!=max){
                for(int j=i+1; j<a.length; j++){
                    if(a[i]==a[j]){
                        count++;
                        a[j]=max;
                    }
                }
                System.out.print(a[i]+": "+count+"   ");
            }
            
        }

    }
}
