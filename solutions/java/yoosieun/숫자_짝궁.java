class Solution {
    public String solution(String X, String Y) {
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        
        for(char c : X.toCharArray()){
            cntX[c-'0']++;
        }
        
        for(char c : Y.toCharArray()){
            cntY[c-'0']++;
        }
        
        // StringBuilder 미사용시 시간 초과
        StringBuilder result = new StringBuilder();
        
        for(int i=9; i>=0; i--){
            int min = Math.min(cntX[i], cntY[i]);
            
            for(int j=0; j<min; j++){
                result.append(i);
            }
        }
        
        if(result.length() == 0) return "-1";
        
        if(result.charAt(0) == '0') return "0";
        
        return result.toString();
    }
}
