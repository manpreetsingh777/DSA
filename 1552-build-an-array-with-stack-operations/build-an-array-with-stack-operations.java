class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int k = 1;
        for (int i = 0; i < target.length; i++) {
            while (k < target[i]) {
                ans.add("Push");
                ans.add("Pop");
                k++;
            }

            ans.add("Push");
            k++;
        }
        return ans;
    }
}