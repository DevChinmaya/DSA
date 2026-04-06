//Write a program to remove duplicate elements
//I/P:{1,2,1,2,3,4,6,7,4}
//O/P:{1,2,3,4,6,7}
public class Q27 {
    public static void main(String[] args) {
        int a[]={1,2,1,2,3,4,6,7,4};
        for(int i=0; i<a.length-1; i++){
            //int count=1;
            if(a[i] != 0){
                for(int j=i+1; j<a.length; j++){
                    if(a[i]==a[j]){
                        //count++;
                        a[j]=0;
                    }
                }
                System.out.print(a[i]+" ");
            }
        }
    }
}
