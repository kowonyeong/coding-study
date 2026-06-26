class Solution {
    public String solution(String s, String skip, int index) {
        // 길이가 26 - skip.length() 인 char 배열 alp 선언
        char[] alp = new char[26-skip.length()];
        
        // skip에 있는 문자 제외하고 순서대로 alp에 채우기
        int idx=0;
        for(char c='a'; c<='z'; c++){
            // c가 없으면 -1 반환
            if(skip.indexOf(c) == -1){
                alp[idx++] = c;
            }
        }
        
        // 결과 문자열 result 선언
        String result = "";
        
        // 문자열 s 순회
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            // 배열 alp 순회하면서 c의 인덱스 찾기
            int num=-1;
            for(int j=0; j<alp.length; j++){
                if(c == alp[j]){
                    num = j;
                    break;
                }
            }
            
            // result에 num + index 번째 문자 추가
            // 만약 z 넘어가면 a부터
            result += alp[(num+index) % alp.length];
        }
        
        return result;
    }
}
