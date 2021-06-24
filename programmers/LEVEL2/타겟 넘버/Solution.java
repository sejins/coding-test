import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int n = numbers.length;
        int[][] graph = new int[n+1][2];


        for(int i=0; i<n; i++){
            graph[i][0] = i+1;
            graph[i][1] = numbers[i];
        }

        answer = bfs(target, n, graph);
        return answer;
    }

    private int bfs(int target, int n, int[][] graph){
        int count = 0;
        LinkedList<int[]> queue = new LinkedList<>();
        queue.push(new int[]{graph[0][0], graph[0][1]});
        queue.push(new int[]{graph[0][0], -graph[0][1]});

        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int current = temp[0];
            int value = temp[1];

            if(current!=n){
                queue.add(new int[]{graph[current][0], value+graph[current][1]});
                queue.add(new int[]{graph[current][0], value-graph[current][1]});
            }
            else{
                if(value == target){
                    count++;
                }
            }
        }
        return count;
    }
}