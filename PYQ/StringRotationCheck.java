public class StringRotationCheck {
    public static void main(String[] args) {
        String a="abcd";
        String b="cdab";
        if((a+a).contains(b)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    //This is okay but it takes O(N^2) time complexity...and also an extra char array space
    // public static void main(String[] args) {
    //     String a="abc";
    //     String b="acb";
    //     char ch[]=a.toCharArray();
    //     for(int i=0; i<ch.length; i++){    
    //         for(int j=0; j<ch.length-1; j++){
    //             char temp=ch[j];
    //             ch[j]=ch[j+1];
    //             ch[j+1]=temp;
    //         }
    //         String s=new String(ch);
    //         if(s.equals(b)){
    //             System.out.println("True");
    //             return;
    //         }else{
    //             System.out.println("False");
    //             return;
    //         }
    //     }
    // }
}
