import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();
        int start = -1;
        int end = -1;
        s = s.substring(1,s.length()-1);

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{'){
                start = i+1;
            }
            else if(ch == '}'){
                end = i;
                save(map, start, end, s);
            }
            else if(ch == ','){
                end = i;
                if(s.charAt(i-1)!='}'){
                    save(map, start, end, s);
                    start = i+1;
                }
            }
        }
        System.out.println(map);

        int n = map.size();
        answer = new int[n];

        //map 정렬(value 값을 기준으로)
        List<Map.Entry<String, Integer>> entryList =  new ArrayList<>(map.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(int i=0; i<entryList.size(); i++){
            String value = entryList.get(i).getKey();
            answer[i] = Integer.parseInt(value);
        }
        return answer;
    }

    private void save(HashMap<String, Integer> map, int start, int end, String s){
        String temp = s.substring(start, end);

        if(!map.containsKey(temp)){
            map.put(temp,1);
        }
        else{
            map.put(temp, map.get(temp)+1);
        }
    }
}