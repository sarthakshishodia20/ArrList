class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> looserMap=new HashMap<>();
        HashMap<Integer,Integer> winnerMap=new HashMap<>();
        for(int[] m:matches){
            int winner=m[0];
            int looser=m[1];
            winnerMap.put(winner,winnerMap.getOrDefault(winner,0)+1);
            looserMap.put(looser,looserMap.getOrDefault(looser,0)+1);
        }
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:looserMap.entrySet()){
            if(entry.getValue()==1){
                ans2.add(entry.getKey());
            }
        }
        for(Map.Entry<Integer,Integer> entry:winnerMap.entrySet()){
            if(entry.getValue()==0 || !looserMap.containsKey(entry.getKey())){
                ans1.add(entry.getKey());
            }
        }
        Collections.sort(ans1);
        Collections.sort(ans2);
        List<List<Integer>> result=new ArrayList<>();
        result.add(ans1);
        result.add(ans2);
        return result;
    }
}
