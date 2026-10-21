class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            int cur = nums[i];
             if (cur == 0 && digit == 0) {
                cnt++;
                continue;
            }
            while(cur != 0){
                int dig = cur % 10;
                if(dig == digit)cnt++;
                cur /= 10;
            }
        }
        return cnt;
    }
}