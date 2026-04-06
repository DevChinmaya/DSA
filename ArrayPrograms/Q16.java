//Write a program to count the occurence of each element in a given array
// {1,2,9,3,9,4,9,6,4,6}
// {1-1, 2-1, 9-3, 3-1, 4-2, 6-2}
public class Q16 {
    public static void main(String[] args) {
        int a[]={1,2,9,3,9,4,9,6,4,6};
        for(int i=0; i<a.length-1; i++){
            int count=1;
            if(a[i]!=0){
                
                for(int j=i+1; j<a.length; j++){
                    if(a[i] == a[j]){
                        count++;
                        a[j]=0;
                    }
                }
                System.out.print(a[i]+"-"+count+"  ");
            }
        }
    }
}
