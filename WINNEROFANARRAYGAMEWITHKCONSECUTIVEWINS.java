class Solution {
    public int getWinner(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int ele : arr) {
            list.add(ele);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        // int i = 0;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        while (true) {
            int firstElement = list.get(0);
            int secondElement = list.get(1);
            if (firstElement > secondElement) {
                map.put(firstElement, map.getOrDefault(firstElement, 0) + 1);
                if (map.get(firstElement) == k) {
                    return firstElement;
                }
                list.remove(1);
                list.add(secondElement);
            } else {
                map.put(secondElement, map.getOrDefault(secondElement, 0) + 1);
                if (map.get(secondElement) == k) {
                    return secondElement;
                }
                list.remove(0);
                list.add(firstElement);
            }
            if (k >= arr.length) {
                return max;
            }
        }
    }
}
