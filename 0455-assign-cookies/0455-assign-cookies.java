class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int glen=g.length;
        int slen=s.length;
        int res=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;

        while(i<glen && j<slen){
            if(s[j]>=g[i]){
                res++;
                i++;
                j++;
            }else{
               j++; 
            }
        }
        return res;
    }
}