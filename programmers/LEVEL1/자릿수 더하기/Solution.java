import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = String.valueOf(n);

        for(int i=0; i<temp.length();i++){
            String s = temp.charAt(i)+"";
            answer+=Integer.parseInt(s);
        }
        return answer;
    }
}