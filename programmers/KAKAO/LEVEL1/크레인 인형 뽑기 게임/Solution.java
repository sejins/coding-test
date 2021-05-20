import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int N = board.length;
        Stack<Integer>[] stArr = new Stack[N];
        Stack<Integer> basket = new Stack<>();

        for(int i=0; i<stArr.length; i++){
            stArr[i] = new Stack<>();
        }

        // Stack board 초기화
        for(int j=0; j<N; j++){
            for(int i=N-1; i>=0; i--){
                if(board[i][j]!=0){
                    stArr[j].push(board[i][j]);
                }
            }
        }

        for(int m : moves){
            int temp=0;
            if(!stArr[m-1].empty()){
                temp = stArr[m-1].pop();
            }

            if(temp!=0){
                if(basket.empty())  basket.push(temp);
                else{
                    if(temp==basket.peek()){
                        basket.pop();
                        answer+=2;
                    }
                    else{
                        basket.push(temp);
                    }
                }
            }
        }
        return answer;
    }
}