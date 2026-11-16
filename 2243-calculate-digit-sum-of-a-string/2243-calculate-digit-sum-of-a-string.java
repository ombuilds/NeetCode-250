class Solution {
    public String digitSum(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        
        while (str.length() > k) {
            StringBuilder nextStr = new StringBuilder();
            
            for (int i = 0; i < str.length(); i += k) {
                int sum = 0;
                int end = Math.min(i + k, str.length());
                
                for (int j = i; j < end; j++) {
                    sum += str.charAt(j) - '0';
                }
                
                nextStr.append(sum);
            }
            
            str = nextStr;
        }
        
        return str.toString();
    }
}
