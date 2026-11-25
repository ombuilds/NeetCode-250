class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }
        Arrays.sort(hand);
        Map<Integer,Integer> map=new HashMap<>();

        for(int i:hand){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int x:hand){
            if(!map.containsKey(x)){
                continue;
            }
            for(int i=x;i<x+groupSize;i++){
                if(!map.containsKey(i)){
                    return false;
                }
                map.put(i, map.get(i)-1);
                if(map.get(i)==0){
                    map.remove(i);
                }
            }
        }
        return true;
        
    }
}