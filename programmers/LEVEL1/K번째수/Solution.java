import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int N = commands.length;
        answer = new int[N];
        int n = 0;

        for(int[] command : commands){
            int[] copy = new int[array.length];
            copy = array.clone();
            int[] newArr = new int[command[1] - command[0] + 1];
            for(int i=command[0]-1; i<command[1]; i++){
                newArr[i-command[0]+1] = copy[i];
            }
            Arrays.sort(newArr);
            answer[n++] = newArr[command[2]-1];

        }
        return answer;
    }
}