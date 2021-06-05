import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int minVal = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<minVal){
                minVal = arr[i];
            }
        }

        final int min_ = minVal;

        answer = Arrays.stream(arr).filter(i -> i!=min_).toArray();

        if(answer.length == 0){
            answer = new int[]{-1};
        }

        return answer;
    }
}