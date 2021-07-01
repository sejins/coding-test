import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int result = -1;
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};

        LinkedList<int[]> queue = new LinkedList<>();

        // for(int i=0; i<visited.length; i++){
        //     for(int j=0; j<visited[0].length; j++){
        //         visited[i][j] = false;
        //     }
        // }

        // 탐색 시작
        queue.add(new int[]{0,0,1});


        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int y = temp[0];
            int x = temp[1];
            int cnt = temp[2];


            if(y == n-1 && x == m-1){
                return cnt;
            }

            for(int i=0; i<4; i++){
                int y_ = y + dy[i];
                int x_ = x + dx[i];

                if(y_>= 0 && y_ < n && x_ >=0 && x_ < m){
                    if(maps[y_][x_] == 1 && !visited[y_][x_]){
                        queue.add(new int[]{y_, x_, cnt+1});
                        visited[y_][x_] = true;
                    }
                }
            }
        }

        return result;
    }
}