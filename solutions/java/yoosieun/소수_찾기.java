import java.util.*;

class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        
        for(int i=2; i*i<=n; i++){
            if(isPrime[i]){
                // i*i보다 작은 i의 배수는 이미 이전에 제거되었으므로 i*i부터 시작
                for(int j=i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        
        int cnt=0;
        
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                cnt++;
            }
        }
        
        return cnt;
    }
}
