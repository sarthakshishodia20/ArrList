class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary);
        int maxLength = 0;
        String ans = "";
        for (String str : dictionary) {
            if (canWeMake(s, str)) {
                if (str.length() > maxLength || (str.length() == maxLength && str.compareTo(ans) < 0)) {
                    ans = str;
                    maxLength = str.length();
                }
            }
        }
        return ans;
    }
    public static boolean canWeMake(String a, String b) {
        int i = 0;
        int j = 0;
        while (j < a.length() && i < b.length()) {
            if (a.charAt(j) == b.charAt(i)) {
                i++;
            }
            j++;
        }
        if (i == b.length()) {
            return true;
        }
        return false;
    }
}
