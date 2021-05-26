import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        Integer[] arr = {};
        StringBuffer sb = new StringBuffer();

        // 정수 배열 내림차순으로 정렬하는 방법
        // 다른 사람 풀이도 참고하자!!
        // String.toCharArray 메서드!
        arr = s.chars().boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        Arrays.stream(arr).mapToInt(i->i).forEach(i -> sb.append((char)i));
        answer =sb.toString();
        return answer;
    }
}