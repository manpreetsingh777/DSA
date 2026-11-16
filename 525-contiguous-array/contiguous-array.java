class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) prefix[i] = -1;
            else prefix[i] = 1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += prefix[i];
            if(map.containsKey(sum)) {
                int len = i - map.get(sum);
                max = Math.max(max, len);
            }
            else {
                map.put(sum, i);
            }
        }
        return max;
    }
}
