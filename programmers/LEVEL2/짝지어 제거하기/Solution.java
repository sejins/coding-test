import java.util.*;

class Solution
{
    public int solutio n(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(stack.isEmpty() || stack.peek()!= ch){
                stack.push(ch);
            }
            else{
                stack.pop();
            }
        }
        if(stack.isEmpty()) return 1;

        return 0;
    }
}