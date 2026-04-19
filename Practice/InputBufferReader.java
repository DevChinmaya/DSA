import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputBufferReader {
    public static void main(String[] args) throws Exception {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        char st[]=s.toCharArray();
        String k=bf.readLine();
        int key=Integer.parseInt(s);
        int count=0;
        for(int i=0; i<st.length; i++){
            if(st[i]-'0' == key) count++;
        }
        System.out.println(st);
        System.out.println(count);
    }
}

//BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));



// BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//         String s=bf.readLine();
//         char st[]=s.toCharArray();
//         String k=bf.readLine();
//         int key=Integer.parseInt(k);