import java.util.*;

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        int[][] matrix = new int[rows][columns];

        // 매트릭스 초기화
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=columns; j++){
                matrix[i-1][j-1] = (i-1)*columns + j;
            }
        }
        answer = new int[queries.length];

        for(int n=0; n<queries.length; n++){
            int x1 = queries[n][0]-1;
            int y1 = queries[n][1]-1;
            int x2 = queries[n][2]-1;
            int y2 = queries[n][3]-1;
            int length = 2*(x2-x1+1) + 2*(y2-y1+1) -4;

            int[] flat = new int[length];
            int minValue = Integer.MAX_VALUE;

            for(int i=x1; i<=x2; i++){
                for(int j=y1; j<=y2; j++){
                    if(!(i!=x1 && i!=x2 && j!=y1 && j!=y2)){
                        int x = i;
                        int y = j;
                        int idx = makeIdx(x,y,x1,y1,x2,y2);
                        flat[idx] = matrix[i][j];
                    }
                }
            }
            for(int i=x1; i<=x2; i++){
                for(int j=y1; j<=y2; j++){
                    if(!(i!=x1 && i!=x2 && j!=y1 && j!=y2)){
                        int x = i;
                        int y = j;
                        int idx = makeIdx(x,y,x1,y1,x2,y2);
                        int temp = 0;
                        if(idx!=0){
                            temp = flat[idx-1];
                            matrix[i][j] = temp;
                        }
                        else{
                            temp = flat[length-1];
                            matrix[i][j] = temp;
                        }
                        if(temp <= minValue)    minValue = temp;
                    }
                }
            }
            answer[n] = minValue;
        }
        return answer;

    }

    private int makeIdx(int x,int y,int x1,int y1,int x2,int y2){
        if(x == x1){
            return y-y1;
        }
        else if(y == y2){
            return y2-y1+x-x1;
        }
        else if(x == x2){
            return 2*y2 - y1 + x2 - x1 -y;
        }
        else{
            return 2*y2 - 2*y1 + 2*x2 - x1 - x;
        }
    }
}