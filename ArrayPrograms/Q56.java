import java.util.*;
public class Q56 {
    public static void main(String[] args) {
        String a[]={"Ram","Amar","Cel","David","Bunny"};
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i].compareTo(a[j])>0){
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
