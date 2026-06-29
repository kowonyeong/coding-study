class Solution {
    public String solution(String new_id) {
        StringBuilder sb1 = new StringBuilder();
        
        // 1단계
        for(char c : new_id.toCharArray()){
            sb1.append(Character.toLowerCase(c));
        }
        
        // 2단계
        StringBuilder sb2 = new StringBuilder();
        
        for(int i=0; i<sb1.length(); i++){
            char c = sb1.charAt(i);
            
            if((c >= 'a')&&(c <= 'z') || Character.isDigit(c) ||
                c == '-' || c == '_' || c == '.'){
                sb2.append(c);
            }
        }
        
        // 3단계
        StringBuilder sb3 = new StringBuilder();
        
        for(int i=0; i<sb2.length(); i++){
            char c = sb2.charAt(i);
            
            if((c== '.' && sb3.length() > 0) && sb3.charAt(sb3.length()-1)=='.'){
                continue;
            }
            
            sb3.append(c);
        }
        
        // 4단계
        if(sb3.length()>0 && sb3.charAt(0)=='.'){
            sb3.deleteCharAt(0);
        }
        
        if(sb3.length()>0 && sb3.charAt(sb3.length()-1)=='.'){
            sb3.deleteCharAt(sb3.length()-1);
        }
        
        // 5단계
        if(sb3.length() == 0){
            sb3.append('a');
        }
        
        // 6단계
        if(sb3.length() >= 16){
            sb3.delete(15,sb3.length());
        }
        
        if(sb3.length()>0 && sb3.charAt(sb3.length()-1) == '.'){
            sb3.deleteCharAt(sb3.length()-1);
        }
        
        // 7단계
        if(sb3.length() <= 2){
            while(sb3.length()!=3){
                sb3.append(sb3.charAt(sb3.length()-1));
            }
        }
        
        return sb3.toString();
    }
}
