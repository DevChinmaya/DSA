// Q28: String = I love python 
// Input: - “java” Output: - I love java
// REPLACE “python” with "java" 

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word u want to replace: ");
        String s = "I love python";
        String[] res = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<res.length-1; i++){
            sb.append(res[i]).append(" ");
        }
        sb.append(sc.next());
        System.out.println(sb.toString());
    }
    
}
