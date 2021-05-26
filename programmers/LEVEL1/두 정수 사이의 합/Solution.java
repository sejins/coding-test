class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int big = Math.max(a,b);
        int small = Math.min(a,b);

        if(big==small)  answer = a;
        else{
            for(int i=small; i<=big; i++){
                answer+=i;
            }
        }

        return answer;
    }
}