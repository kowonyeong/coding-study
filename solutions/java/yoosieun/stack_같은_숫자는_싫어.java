import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stk = new Stack<>();
        
        for(int num : arr){
            if(stk.isEmpty()){
                stk.push(num);
            }
            else{
                if(stk.peek() != num){
                    stk.push(num);
                }
            }
        }
        
        int[] result = new int[stk.size()];
        
        for(int i=0; i<stk.size(); i++){
            result[i] = stk.get(i);
        }
        
        return result;
    }
}
