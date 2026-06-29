import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        ArrayList<Stack<Integer>> stackList = new ArrayList<>();
        
        for(int i=0; i<board.length; i++){
            stackList.add(new Stack<>());
        }
        
        for(int col=0; col<board.length; col++){
            for(int row=board.length-1; row>=0; row--){
                if(board[row][col]!=0){
                    stackList.get(col).push(board[row][col]);
                }
            }
        }
        
        Stack<Integer> stack = new Stack<>();
        int cnt=0;
        
        for(int i=0; i<moves.length; i++){
            int col = moves[i] - 1;
            
            if(!stackList.get(col).isEmpty()){
                int doll = stackList.get(col).pop();
                
                if(!stack.isEmpty() && stack.peek() == doll){
                    stack.pop();
                    cnt+=2;
                }
                else{
                    stack.push(doll);
                }
            }
        }
        
        return cnt;
    }
}
