class Solution {
    // TODO 문제를 잘 읽었어야했음!!
    public int solution(String name) {
        int answer = 0;

        String copy = "";
        for(int i=0; i<name.length(); i++){
            copy += 'A';
        }
        int curIdx = 0;

        int temp = findMinCountAlp(curIdx, copy, name);
        copy = change(curIdx, copy, name);
        answer+=temp;
        System.out.println(copy);
        System.out.println(answer);

        while(!copy.equals(name)){
            int nextIdx = Integer.MAX_VALUE;
            int minDistance = 9999;

            for(int i=0; i<name.length(); i++){
                if(copy.charAt(i)=='A' && name.charAt(i)!='A'){
                    int tempDistance = 9999;
                    if(i >= curIdx) {
                        tempDistance = Math.min(i - curIdx, name.length() - i + curIdx);
                    }
                    else{
                        tempDistance = Math.min(curIdx - i, name.length() - curIdx + i);
                    }
                    if(tempDistance < minDistance){
                        minDistance = tempDistance;
                        nextIdx = i;
                    }
                    else if(tempDistance == minDistance){
                        if(i < nextIdx){
                            nextIdx = i;
                        }
                    }
                }
            }
            answer+=minDistance;
            System.out.println(minDistance);
            curIdx = nextIdx;

            answer += findMinCountAlp(curIdx, copy, name);
            copy = change(curIdx, copy,name);
            System.out.println(copy);
            System.out.println(answer);
        }
        return answer;
    }

    private String change(int curIdx, String copy, String name) {
        return copy.substring(0,curIdx) + name.charAt(curIdx) + copy.substring(curIdx+1, copy.length());
    }

    private int findMinCountAlp(int curIdx, String copy, String name) {
        int namechar = name.charAt(curIdx);
        int copyChar = copy.charAt(curIdx);

        return Math.min(namechar-copyChar, 26-namechar+copyChar);
    }
}