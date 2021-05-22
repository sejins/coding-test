import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer,Double> map = new HashMap<>();

        for(int i=1; i<=N; i++){
            int reach = 0;
            int reachButNoClear = 0;
            if(i==1){
                reach = stages.length;
            }
            for(int userStage : stages){
                if(i==userStage){
                    reachButNoClear++;
                }
                if(i!=1 && i<=userStage){
                    reach++;
                }
            }
            if(reach==0){
                map.put(i,0.0);
                continue;
            }
            double d = (double)reachButNoClear/reach;
            //System.out.printf("%d : %f%n",i,d);
            map.put(i,d);
        }

        List<Map.Entry<Integer,Double>> entries = new LinkedList<>(map.entrySet());
        System.out.println(entries);
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> e1, Map.Entry<Integer, Double> e2) {
                if(e1.getValue().equals(e2.getValue())){
                    return e1.getKey().compareTo(e2.getKey());
                }
                else{
                    return e2.getValue().compareTo(e1.getValue());
                }
            }
        });
        for(int i=0; i<entries.size(); i++){
            answer[i]=entries.get(i).getKey();
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}