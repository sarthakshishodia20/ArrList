class Solution {
    static Set<List<Integer>> set;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, 0, result, new ArrayList<>(), target);
        return result;
    }

    public static void helper(int[] arr, int index, List<List<Integer>> result, List<Integer> combin, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            List<Integer> temp = new ArrayList<>(combin);
            if (set.contains(temp)) { 
                return;
            }
            set.add(temp);
            result.add(temp);
            return;
        }
        if (index == arr.length) {
            return;
        }
        combin.add(arr[index]);
        helper(arr, index + 1, result, combin, target - arr[index]);
        helper(arr, index, result, combin, target - arr[index]);
        combin.remove(combin.size() - 1);
        helper(arr, index + 1, result, combin, target);
    }
}
