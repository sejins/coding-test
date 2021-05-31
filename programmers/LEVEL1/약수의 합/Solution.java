class Solution {
    public int solution(int n) {
        int answer = 0;

        int middle = (int)(Math.sqrt(n)+1);

        for(int i=1; i<middle; i++){
            if(n%i==0){
                int temp = n/i;
                answer+=i;
                if(i!=temp)
                    answer+=(n/i);
            }
        }
        return answer;
    }
}