import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        for(int a : arr){
            if(a%divisor == 0){
                list.add(a);
            }
        }// 나는 수동으로 리스트를 만들고 스트림을 사용했는데, 기본 배열에서 스트림을 생성할 수 있는 방법이 있다.

        answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);

        if(answer.length == 0){
            answer = new int[]{-1};
        }
        return answer;
    }
}