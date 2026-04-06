//Write a program to count the occurence of each element in a given array
// {1,2,9,3,9,4,9,6,4,6}
//  9-3
public class Q17 {
    public static void main(String[] args) {
        int a[]={1,2,9,3,9,4,9,6,4,6};
        
        int maxCount=1;
        int maxEle=a[0];
        for(int i=0; i<a.length-1; i++){
            int count=1;
            if(a[i] == 0)continue;
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=0;
                }
            }
            if(maxCount < count){
                maxCount=count;
                maxEle=a[i];
            }
        }
        System.out.println(maxEle+"-"+maxCount);
    }
}
