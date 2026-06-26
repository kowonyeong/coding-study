class Solution {
    // n : 전체 학생 수
    public int solution(int n, int[] lost, int[] reserve) {
        // 각 학생이 가지고 있는 체육복 수(1로 초기화)
        int[] cur = new int[n];
        
        for(int i=0; i<n; i++){
            cur[i] = 1;
        }
        
        for(int i=0; i<lost.length; i++){
            cur[lost[i] - 1]--;
        }
        
        for(int i=0; i<reserve.length; i++){
            cur[reserve[i] - 1]++;
        }
        
        // 그리디
        for(int i=0; i<n; i++){
            // 만약 i번째 학생이 체육복이 없으면
            if(cur[i]==0){
                // 왼쪽 학생한테 빌리기
                if(i-1>=0 && cur[i-1] == 2){
                    cur[i]++;
                    cur[i-1]--;
                }
                // 안되면 오른쪽 학생한테 빌리기
                else if(i+1 < n && cur[i+1] == 2){
                    cur[i]++;
                    cur[i+1]--;
                }
            }
        }
        
        // 수업 들을 수 있는 학생 count
        int cnt = 0;
        
        for(int i=0; i<n; i++){
            if(cur[i] >= 1){
                cnt++;
            }
        }
        
        return cnt;
    }
}
