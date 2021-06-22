import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue queue = new PriorityQueue();

        for(int i : scoville){
            queue.offer(i);
        }
        while((Integer)(queue.peek())<K){
            if(queue.size() == 1){
                return -1;
            }
            int temp1 = (Integer)queue.poll();
            int temp2 = (Integer)queue.poll();
            queue.offer(temp1 + (temp2)*2);
            answer++;

        }
        return answer;
    }
}