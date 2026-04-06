public class PrintAllMinOccuredEle {
    public static void main(String[] args) {
        int a[]={1,4,2,4,6,2,7,8,9};
        int occCnt[]=new int[a.length];
        int minCount=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            int count=1;
            if(a[i] != min){
                for(int j=i+1; j<a.length; j++){
                    if(a[i]==a[j]){
                        count++;
                        a[j]=min;
                    }
                }
                if(minCount > count) minCount=count;
                occCnt[i]=count;
            }
        }
        for(int i=0; i<occCnt.length; i++){
            if(occCnt[i]==minCount)System.out.println("Occurance of "+a[i]+": "+minCount);
        }
        //System.out.println(Arrays.toString(occCnt));
    }
}
