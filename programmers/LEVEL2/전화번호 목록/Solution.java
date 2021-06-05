import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String,Integer> map = new HashMap<>();

        for(String p : phone_book){
            map.put(p,1);
        }

        boolean flag = false;

        for(String p : phone_book){
            for(int i=1; i<p.length(); i++){
                String temp = p.substring(0,i);
                if(map.containsKey(temp)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                answer=false;
                break;
            }
        }

        return answer;
    }
}