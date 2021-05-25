import java.util.LinkedList;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        boolean[] check = new boolean[10];
        int ex=0;
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<arr.length; i++){
            if(!check[arr[i]]){
                check[ex] = false;
                list.add(arr[i]);
                ex = arr[i];
                check[arr[i]] = true;
            }
        }

        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}