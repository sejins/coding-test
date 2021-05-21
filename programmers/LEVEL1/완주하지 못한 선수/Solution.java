import java.util.HashMap;
import java.util.Set;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();

        for(String name : participant){
            if(!map.containsKey(name)){
                map.put(name,1);
            }
            else{
                map.put(name,map.get(name)+1);
            }
        }

        for(String name : completion){
            if(map.get(name)==1){
                map.remove(name);
            }
            else{
                map.put(name,map.get(name)-1);
            }
        }
        Set<String> finalName = map.keySet();
        System.out.println(finalName.size());
        answer = (String)finalName.toArray()[0];
        return answer;
    }
}