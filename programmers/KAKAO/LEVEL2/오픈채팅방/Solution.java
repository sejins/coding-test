import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Enter","님이 들어왔습니다.");
        map1.put("Leave","님이 나갔습니다.");
        HashMap<String, String> map2 = new HashMap<>();
        ArrayList<String[]> list = new ArrayList<>();

        for(String log : record){
            String[] comm = log.split("[ ]+");
            if(comm[0].equals("Enter")){
                map2.put(comm[1],comm[2]);
                list.add(new String[]{comm[1],"Enter"});
            }
            else if(comm[0].equals("Change")){
                map2.put(comm[1],comm[2]);
            }
            else{
                list.add(new String[]{comm[1],"Leave"});
            }
        }
        answer = new String[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = map2.get(list.get(i)[0]) + map1.get(list.get(i)[1]);
        }

        return answer;
    }
}