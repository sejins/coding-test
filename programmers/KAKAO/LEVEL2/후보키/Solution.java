import java.util.*;

class Solution {
    public int solution(String[][] relation) {
        int answer = 0;
        int n = relation[0].length;
        ArrayList<String> available = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int[] result = new int[1];
        for(int r=1; r<=n; r++){
            comb(0, r, n, relation, visited, available, result);
        }
        answer = result[0];
        return answer;
    }

    private void comb(int start, int r, int n, String[][] relation, boolean[] visited, ArrayList<String> available, int[] result){

        if(r == 0){
            count(relation, visited, available, result);
        }
        else{
            for(int i=start; i<n; i++){
                visited[i] = true;
                comb(i+1, r-1, n, relation, visited, available, result);
                visited[i] = false;
            }
        }
    }

    private void count(String[][] relation, boolean[] visited, ArrayList<String> available, int[] result){
        HashSet<String> set = new HashSet<>();
        ArrayList<Integer> indexList = new ArrayList<>();


        for(int i=0; i<visited.length; i++){
            if(visited[i])  indexList.add(i);
        }
        System.out.println(indexList);
        for(int i=0; i<relation.length; i++){
            String temp = "";
            for(int j : indexList){
                temp += relation[i][j];
            }
            set.add(temp);
        }
        if(relation.length != set.size())   return;
        // 여기까지 유일성 판단 부분

        String candKey = "";
        for(int i : indexList){
            candKey+=(i+"");
        }

        for(String keys : available){
            char[] chrArr = keys.toCharArray();
            boolean isContain = true;
            for(char ch : chrArr){
                if(!candKey.contains(ch+""))    isContain = false;
            }
            if(isContain)   return;
        }

        available.add(candKey);
        result[0]++;
    }
}