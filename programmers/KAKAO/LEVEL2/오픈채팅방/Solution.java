import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> commandMap = new HashMap<>();
        commandMap.put("Enter","님이 들어왔습니다.");
        commandMap.put("Leave","님이 나갔습니다.");

        for(String s : record){
            String[] strArr = s.split("[ ]+");
            String command = strArr[0];
            String id = strArr[1];

            if(command.equals("Enter")){
                String nickname = strArr[2];
                map.put(id,nickname);
                list.add(String.format("%s %s",id,command));
            }
            else if(command.equals("Change")){
                String nickname = strArr[2];
                map.put(id,nickname);
            }
            else{
                list.add(String.format("%s %s",id,command));
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            String[] arr = list.get(i).split(" ");
            answer[i] = map.get(arr[0])+commandMap.get(arr[1]);
        }
        return answer;
    }
}