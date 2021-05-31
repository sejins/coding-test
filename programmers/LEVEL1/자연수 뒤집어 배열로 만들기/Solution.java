import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer(String.valueOf(n)).reverse();

        for(int i=0; i<sb.length(); i++){
            list.add(Integer.parseInt(sb.charAt(i)+""));
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}