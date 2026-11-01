
class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int low = 0;
        int n = price.length;
        int high = price[n - 1] - price[0];
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ispos(price, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    private boolean ispos(int[] price, int k, int m) {
        int last = price[0];
        int cur = k - 1;
        for (int i = 1; i < price.length; i++) {
            if (price[i] - last >= m) {
                cur--;
                last = price[i];
            }

            if (cur == 0) return true;
        }
        return false;
    }
}
