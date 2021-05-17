import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] count = new int[4];

        for(int i=0; i<answers.length; i++){

            if(answers[i]==su1(i)){
                count[1]++;
            }
            if(answers[i]==su2(i)){
                count[2]++;
            }
            if(answers[i]==su3(i)){
                count[3]++;
            }
        }

        int max=0;
        for(int i=1; i<count.length; i++){
            if(count[i]>max)    max=count[i];
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<count.length; i++){
            if(count[i]==max){
                list.add(i);
            }
        }

        answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }

    private static int su1(int i){
        return (i%5)+1;
    }

    private static int su2(int i){
        int[] ans = {2,1,2,3,2,4,2,5};
        return ans[i%8];
    }

    private static int su3(int i){
        int[] ans = {3,3,1,1,2,2,4,4,5,5};
        return ans[i%10];
    }
}