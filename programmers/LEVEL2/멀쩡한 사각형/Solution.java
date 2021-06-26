class Solution {
    public long solution(int w, int h) {
        long answer = 1;

        int md = 1;
        int temp = Math.min(w,h);
        long total = (long)w*h;
        int dontUse = 0;


        while(temp>=2){ // 최대 1억번 돌 수 있음!!
            if(w%temp ==0 && h%temp==0){
                md = temp;
                w/=temp;
                h/=temp;
                break;
            }
            temp--;
        }

        dontUse = (h+w-1)*md;
        answer = total - dontUse;

        return answer;
    }
}