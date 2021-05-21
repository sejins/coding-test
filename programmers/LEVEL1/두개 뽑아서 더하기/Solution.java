import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                int temp = numbers[i]+numbers[j];
                if(!list.contains(temp))    list.add(temp);
            }
        }

        answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);

        return answer;
    }
}