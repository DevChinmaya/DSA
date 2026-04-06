public class PrintAllMaxOccuredEle {
    public static void main(String[] args) {
        int a[]={1,4,2,4,6,2,7,8,9};
        int occCnt[]=new int[a.length];
        int maxCount=0;
        int max=Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            int count=1;
            if(a[i] != max){
                for(int j=i+1; j<a.length; j++){
                    if(a[i]==a[j]){
                        count++;
                        a[j]=max;
                    }
                }
                if(maxCount < count) maxCount=count;
                occCnt[i]=count;
            }
        }
        for(int i=0; i<occCnt.length; i++){
            if(occCnt[i]==maxCount)System.out.println("Occurance of "+a[i]+": "+maxCount);
        }
        //System.out.println(Arrays.toString(occCnt));
    }
}
