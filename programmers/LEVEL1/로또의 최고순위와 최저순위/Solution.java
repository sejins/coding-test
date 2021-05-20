class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zCnt = 0;
        int[] score = {6,6,5,4,3,2,1};
        int max;
        int min;

        for(int l : lottos){
            if(l!=0){
                for(int w : win_nums){
                    if(l == w){
                        cnt++;
                        break;
                    }
                }
            }
            else{
                zCnt++;
            }
        }
        max=cnt+zCnt;
        min=cnt;
        answer[0] = score[max];
        answer[1] = score[min];
        return answer;
    }
}