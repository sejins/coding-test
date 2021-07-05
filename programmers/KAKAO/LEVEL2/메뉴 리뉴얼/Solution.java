import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        ArrayList<String> result = new ArrayList<>();

        for(int r : course){
            HashMap<String, Integer> map = new HashMap<>();
            for(String order : orders){
                if(r<=order.length()){
                    char[] arr = order.toCharArray();
                    Arrays.sort(arr);
                    //System.out.println(Arrays.toString(arr));
                    int n = arr.length;
                    int start = 0;
                    boolean[] visited = new boolean[n];
                    combination(arr, visited, n, start, r, map);
                }
            }
            // map 조회해서 가장 높은 횟수 등장한 것들 result 추가 (2회 이상)
            //System.out.println(map);
            addCourse(map,result);

        }
        Collections.sort(result);
        System.out.println(result);
        answer = result.toArray(new String[result.size()]);
        return answer;
    }

    private void combination(char[] arr, boolean[] visited, int n, int start, int r, HashMap<String,Integer> map){

        if(r == 0){
            count(arr, visited, n, map);
            return;
        }

        for(int i=start; i<n; i++){
            visited[i] = true;
            combination(arr, visited, n, i+1, r-1, map);
            visited[i] = false;
        }
    }

    private void count(char[] arr, boolean[] visited, int n, HashMap<String, Integer> map){
        String temp = "";

        for(int i=0; i<n; i++){
            if(visited[i])  temp+=arr[i];
        }
        //System.out.println(Arrays.toString(visited));
        //System.out.println(temp);
        if(!map.containsKey(temp)){
            map.put(temp,1);
        }
        else{
            map.put(temp, map.get(temp)+1);
        }
    }

    private void addCourse(HashMap<String, Integer> map, ArrayList<String> result){
        int max = Integer.MIN_VALUE;
        Set<String> set = map.keySet();
        for(String s : set){
            int temp = map.get(s);
            if(temp>=2 && temp >= max){
                max = temp;
            }
        }
        for(String s: set){
            if(map.get(s) == max)   result.add(s);
        }
    }
}