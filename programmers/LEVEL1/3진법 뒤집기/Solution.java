class Solution {
    public int solution(int n) {
        int answer = 0;

        StringBuffer sb = new StringBuffer();

        while(n!=0){
            int temp = n % 3;
            sb.append(temp);
            n/=3;
        }

        for(int i=0; i<sb.length(); i++){
            int temp = Integer.parseInt(sb.substring(i,i+1));
            answer+=(temp*(int)Math.pow(3,sb.length()-i-1));
        }

        return answer;
    }
}