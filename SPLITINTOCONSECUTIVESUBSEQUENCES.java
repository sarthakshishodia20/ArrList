class Solution {
    public boolean isPossible(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsequences = new ArrayList<>();
        for (int num : nums) {
            List<Integer> best = null;
            for (List<Integer> seq : subsequences) {
                if (seq.get(seq.size() - 1) + 1 == num) {
                    if (best == null || seq.size() < best.size()) {
                        best = seq;
                    }
                }
            }
            if (best != null) {
                best.add(num);
            } else {
                List<Integer> newSeq = new ArrayList<>();
                newSeq.add(num);
                subsequences.add(newSeq);
            }
        }
        for (List<Integer> seq : subsequences) {
            if (seq.size() < 3) return false;
        }
        return true;
    }
}
