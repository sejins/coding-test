import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for(int req : d){
            if(req<=budget){
                budget-=req;
                answer++;
            }
        }

        return answer;
    }
}