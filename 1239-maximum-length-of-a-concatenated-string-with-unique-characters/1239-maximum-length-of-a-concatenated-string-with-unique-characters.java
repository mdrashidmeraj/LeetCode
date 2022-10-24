class Solution {
    private int max = 0;
    public int maxLength(List<String> arr) {
        dfs(arr, 0, "");
        return max;
    }

    public void dfs(List<String> arr, int index, String concatenatStr) {
        if (isUnique(concatenatStr)) max = Math.max(max, concatenatStr.length());
        if (index == arr.size() || !isUnique(concatenatStr))  return;
        for (int i = index; i < arr.size(); i++) {
            dfs(arr, i + 1, concatenatStr + arr.get(i));
        }
    }
    private boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}