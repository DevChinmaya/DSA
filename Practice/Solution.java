
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0; i<board.length; i++){
            mp.put(char[i][j],mp.getOrDefault(mp.get(i), 0)+1);

        }
        
    }
}