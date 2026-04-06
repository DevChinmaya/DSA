//Write a program to count the occurence of each element in a given array
// {1,1,1,2,9,3,9,4,9,6,4,6}
//  2-1

public class Q18 {
    public static void main(String[] args) {
        int a[]={1,1,1,2,9,3,9,4,9,6,4,6};
        
        int minCount=a.length-1;
        int minEle=a[0];
        for(int i=0; i<a.length-1; i++){
            int count=1;
            if(a[i]!=0){
                for(int j=i+1; j<a.length; j++){
                    if(a[i]==a[j]){
                        count++;
                        a[j]=0;
                    }
                }
                if(minCount > count){
                    minCount=count;
                    minEle=a[i];
                }
            }
            
        }
        System.out.println(minEle+"-"+minCount);
    }
}
