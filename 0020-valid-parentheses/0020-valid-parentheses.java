class Solution {
    public boolean isValid(String s) {
        if(s==null || s.length()%2!=0){
            return false;
        }

        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
            s=s.replace("()","").replace("{}","").replace("[]","");
        }

        return s.isEmpty();
    }
}