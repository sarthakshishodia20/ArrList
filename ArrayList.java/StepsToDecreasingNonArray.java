class Solution {
    public int totalSteps(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int ele:nums){
            list.add(ele);
        }
        int steps=0;
        while(!nahiHai(list)){
            for(int i=1;i<list.size();i++){
                if(list.get(i-1)>list.get(i)){
                    list.remove(list.get(i));
                }
            }
            steps++;
        }
        return steps;
    }
    public static boolean nahiHai(List<Integer> list){
        for(int i=1;i<list.size();i++){
            if(list.get(i-1)>list.get(i)){
                return false;
            }
        }
        return true;
    }
}
