import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        ArrayList<Integer> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            char tmp = str.charAt(i);
            list.add((int)tmp);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }});

        list.stream().mapToInt(i -> i).forEach(i -> sb.append((char)i));
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}