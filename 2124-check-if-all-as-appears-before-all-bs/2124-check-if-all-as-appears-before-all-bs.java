class Solution {
    public boolean checkString(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' && !set.contains('b')) set.add('a');
            else if(s.charAt(i)=='b') set.add('b');
            else if(s.charAt(i)=='a' && set.contains('b')) return false;
        }

        return true;
    }
}