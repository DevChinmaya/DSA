//An element is a leader if it is greater than all elements to its right.
//I/P: {16 ,17 ,4, 3 ,5 ,20}
//O/P: 17, 15, 2
public class LeadersInArray{
    public static void main(String[] args) {
        int[]a= {16 ,17 ,4, 3 ,5,2}; 
        for(int i=0; i<a.length; i++){
            boolean flag=true;
            for(int j=i+1; j<a.length; j++){
                if(a[i] < a[j]){
                    flag=false;
                    break;
                }
            }
            if(flag) System.out.println(a[i]);
        }
    }
}