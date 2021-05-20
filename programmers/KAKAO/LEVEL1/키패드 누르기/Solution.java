import java.util.LinkedList;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] graph = {
                {8},
                {2,4},
                {1,3,5},
                {2,6},
                {1,5,7},
                {2,4,6,8},
                {3,5,9},
                {4,8},
                {5,7,9,0},
                {6,8},
                {7,0},
                {9,0,}};
        boolean[] visited = new boolean[12];
        int left=10;// *
        int right=11;// #
        for(int num : numbers){
            System.out.println(num);
            if(num==1 || num==4 || num==7){
                left=num;
                answer+="L";
            }
            else if(num==3 || num==6 || num==9){
                right=num;
                answer+="R";
            }
            else{
                int leftDist = bfs(graph, visited.clone(), left,num);
                int rightDist = bfs(graph, visited.clone(), right,num);

                if(leftDist<rightDist){
                    left = num;
                    answer+="L";
                }
                else if(leftDist>rightDist){
                    right=num;
                    answer+="R";
                }
                else{
                    if(hand.equals("left")){
                        left = num;
                        answer+="L";
                    }
                    else{
                        right=num;
                        answer+="R";
                    }
                }
            }
        }
        return answer;
    }
    private int bfs(int[][] graph, boolean[] visited, int start, int destination){
        LinkedList queue = new LinkedList();
        queue.add(new int[]{start,0});
        visited[start]=true;

        while(queue.size()>0){
            int[] temp = (int[])queue.poll();

            if(temp[0]==destination)    return temp[1];

            for(int node : graph[temp[0]]){
                if(!visited[node]){
                    visited[node]=true;
                    queue.add(new int[]{node, temp[1]+1});
                }
            }
        }
        return -1;
    }
}