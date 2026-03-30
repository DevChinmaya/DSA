public class StringCompression{
    public static void main(String[] args) {
        String s="aaabbcc";
        StringBuilder sb = new StringBuilder();
        int count=1;

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(i < s.length()-1 && ch == s.charAt(i+1)){
                count++;
            }else{
                sb.append(ch).append(count);
                count=1;
            }
        }
        System.out.println(sb.toString());
    }

    //This is also a possible method
    
    // public static void main(String[] args) {
    //     String s="aaabbcc";
    //     int count=1;
    //     String s1=s+" ";
    //     for(int i=0; i<s1.length()-1; i++){
    //         char ch=s1.charAt(i);
    //         if(ch == s1.charAt(i+1)){
    //             count++;
    //         }else{
    //             System.out.print(ch+""+count);
    //             count=1;
    //         }
    //     }
    // }
}