class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        n=n-10;
        int count=0;
        for(int i=9;i>=0;i--){
            count++;
            if(n<i){
                if(count%2==0){
                    return false;
                }else{
                    return true;
                }
            }else{
                n=n-i;
            }   

        }

        return count%2==0;
    }
}