//Q10: write a java program to count vowel characters in a string?

public class Q10 {
    public static void main(String[] args) {
        String s="adhedioq";
        int cnt=0;
        char[] ch = s.toCharArray();
        for(char c:ch){
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
