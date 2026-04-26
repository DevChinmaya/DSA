public class ArrayList{
    private Object a[];
    private int count;
    ArrayList(){
        a=new Object[5];
        count=0;
    }
    public void add(Object ele){
        if(count >= a.length){
            increase();
        }
        a[count++]=ele;
    }
    public void increase(){
        Object temp[]=new Object[a.length+3];
        for(int i=0; i<a.length; i++){
            temp[i]=a[i];
        }
        a=temp;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void add(Object ele,int index){
        if(index<0 || index >=size())
            throw new IndexOutOfBoundsException();
        if(count>=a.length) increase();
        for(int i=count-1; i>=index; i--){
            a[i+1]=a[i];
        }
        a[index]=ele;
        count++;
    }
    public void remove(int index){
        if(index<0 || index >=size()){
            throw new IndexOutOfBoundsException();
        }
        for(int i=index; i<count; i++){
            a[i]=a[i+1];
        }
        count--;
        a[count]=null;
    }
    public Object get(int index){
        if(index<0 || index >=size()){
            throw new IndexOutOfBoundsException();
        }
        return a[index];
    }
}