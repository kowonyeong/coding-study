import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)){
                // compareTo메소드 알기
                return a.compareTo(b);
            }
            
            // a - b : 오름차순
            return a.charAt(n) - b.charAt(n);
        });
        
        return strings;
    }
}
