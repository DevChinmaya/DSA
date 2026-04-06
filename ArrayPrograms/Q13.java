//Write a java program to print the number of zeros present in the array

public class Q13 {
    public static void main(String[] args) {
        int[]a={1,0,3,0,0,3,4,0};
        int count=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==0)count++;
        }
        System.out.println(count);
    }
}
