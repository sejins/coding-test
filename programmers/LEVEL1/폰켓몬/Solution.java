class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;
        int count = 0;
        boolean[] check = new boolean[200001]; // 0, 1~200000

        for(int i=0; i<nums.length; i++){
            if(!check[nums[i]]){
                check[nums[i]]=true;
                answer++;
                count++;
            }
            if(count==n){
                break;
            }
        }
        if(n==0){
            return 0;
        }
        else {
            returna answer;
        }
    }
}