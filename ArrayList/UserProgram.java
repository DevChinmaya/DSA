
public class UserProgram {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(12);
        a.add(32);
        a.add(33);
        a.add(83);
        a.add(34);
        a.add(31);
        a.add(98);
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}
