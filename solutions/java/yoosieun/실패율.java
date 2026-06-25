import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] failRate = new double[N];
        int failSum = 0;
        
        for(int i=0; i<N; i++){
            int failStage = i+1;
            int failCnt = 0;
            
            for(int j=0; j<stages.length; j++){
                if(stages[j] == failStage){
                    failCnt++;
                }
            }
            
            double rate;
            if(stages.length - failSum == 0){
                rate = 0;
            }
            else{
                rate = (double) failCnt / (double) (stages.length - failSum);
            }
            
            failRate[i] = rate;
            failSum += failCnt;
        }
        
        Integer[] order = new Integer[N];
        
        for(int i=0; i<N; i++){
            order[i] = i+1;
        }
        
        Arrays.sort(order, (a,b)->{
            if(failRate[a-1] == failRate[b-1]){
                return a-b;
            }
            return Double.compare(failRate[b-1], failRate[a-1]);
        });
        
        int[] result = new int[N];
        
        for(int i=0; i<N; i++){
            result[i] = order[i];
        }
        
        return result;
    }
}
