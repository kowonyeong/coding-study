class Solution {
    // n : 벽의 길이
    // m : 롤러의 길이
    public int solution(int n, int m, int[] section) {
        // 전체 벽 모두 true
        boolean[] arr = new boolean[n]; 
        
        for(int i=0; i<arr.length; i++){
            arr[i] = true;
        }
        
        for(int i=0; i<section.length; i++){
            // 칠해야 할 벽 false
            arr[section[i] - 1] = false; 
        }
        
        int cnt = 0;
        
        for(int i=0; i<n; i++){
            // 벽에 페인트가 칠해지지 않았으면
            if(!arr[i]){
                cnt++;
                // 길이 m만큼 페인트 칠하기
                for(int j=i; j<i+m && j<n; j++){
                    arr[j] = true;
                }
            }
        }
        
        return cnt;
    }
}
