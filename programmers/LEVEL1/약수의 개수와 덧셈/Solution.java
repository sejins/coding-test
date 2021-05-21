class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++){
            int temp = (int)Math.sqrt(i);
            if(i == temp*temp){
                answer-=i;
            }
            else{
                answer+=i;
            }
        }
        return answer;
    }
}