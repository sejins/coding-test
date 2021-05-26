import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Character c1 = o1.charAt(n);
                Character c2 = o2.charAt(n);

                if(c1.equals(c2)){
                    return o1.compareTo(o2);
                }
                else    return c1.compareTo(c2);
            }
        });
        answer = strings;
        return answer;
    }
}