//To print repeated elements of an array
// I/P:{1,2,2,4,1,4,6,4,9,7,4,5}
// O/P:{1,2,4}
public class Q35 {
    public static void main(String[] args) {
        int a[]={1,2,2,4,1,4,6,4,9,7,4,5};
        for(int i=0; i<a.length-1; i++){
            int count=1;
            if(a[i]==0)continue;
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=0;
                }
            }
            if(count>1)System.out.print(a[i]+" ");
        }
    }
}
