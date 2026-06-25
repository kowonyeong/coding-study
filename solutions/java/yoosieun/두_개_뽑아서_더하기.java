import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // numbers 중복 제거 + 오름차순 정렬
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] result = new int[set.size()];
        
        int idx = 0;
        for(int sum : set){
            result[idx++] = sum;
        }
        
        return result;
    }
}
