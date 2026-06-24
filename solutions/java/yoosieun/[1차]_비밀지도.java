class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr = new String[n];
        
        for(int i=0; i<n; i++){
            String str1 = decimalToBinary(n, arr1[i]);
            String str2 = decimalToBinary(n, arr2[i]);
            
            String result = "";
            for(int j=0; j<n; j++){
                if((str1.charAt(j) == '#') || (str2.charAt(j) == '#')){
                    result += '#';
                }
                else{
                    result += ' ';
                }
            }
            arr[i] = result;
        }
        
        return arr;
    }
    
    public String decimalToBinary(int n, int num){
        String str = "";
        
        while(n>0){
            str += String.valueOf(num % 2);
            num /= 2;
            n--;
        }
        
        String result = "";
        
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) == '1'){
                result += '#';
            }
            else{
                result += ' ';
            }
        }
        
        return result;
    }
}
