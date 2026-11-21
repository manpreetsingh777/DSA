class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
       int l=0;
       int r=n-1;
       int sum = 0;
       while(l<r){
        sum = Math.max(sum , nums[l] + nums[r]);
        l++;
        r--;
       }
       return sum;
    }
}