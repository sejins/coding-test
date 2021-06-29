import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Integer[]> queue = new LinkedList<>();
        Integer[] priors = new Integer[priorities.length];
        for(int i=0; i<priorities.length; i++){
            int priority = priorities[i];
            priors[i] = priority;
            if(i == location){
                queue.add(new Integer[]{priority,1});
            }
            else{
                queue.add(new Integer[]{priority,0});
            }
        }
        Arrays.sort(priors, Collections.reverseOrder());
        int count = 0;
        int cnt = 0;
        int currentPriority = priors[cnt];

        while(!queue.isEmpty()){
            Integer[] temp = queue.poll();
            int p = temp[0];
            int check = temp[1];
            if(p == currentPriority){
                count++;
                cnt++;
                if(cnt<priors.length) {
                    currentPriority = priors[cnt];
                }
                if(check == 1){
                    answer = count;
                    break;
                }
            }
            else{
                queue.add(temp);
            }
        }
        System.out.println(answer);
        return answer;
    }
}