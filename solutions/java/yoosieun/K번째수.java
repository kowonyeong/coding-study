import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        
        for(int a=0; a<commands.length; a++){
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            
            int[] arr = new int[j-i+1];
            int idx=0;
            
            for(int b=i-1; b<=j-1; b++){
                arr[idx++] = array[b];
            }
            
            Arrays.sort(arr);
            
            result[a] = arr[k-1]; 
        }
        
        return result;
    }
}
