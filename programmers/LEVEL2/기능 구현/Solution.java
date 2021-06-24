import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> progressStack = new Stack<>();
        Stack<Integer> speedStack = new Stack<>();

        for(int i=progresses.length-1; i>=0; i--){
            progressStack.push(progresses[i]);
            speedStack.push(speeds[i]);
        }

        int count = 0;
        int cnt = 0;
        while(!progressStack.isEmpty()){
            int progress = progressStack.peek() + (count*speedStack.peek());

            if(progress >= 100){
                progressStack.pop();
                speedStack.pop();
                cnt++;
            }
            else{
                count++;
                if(cnt!=0){
                    result.add(cnt);
                    cnt=0;
                }
            }
        }
        result.add(cnt);
        answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}