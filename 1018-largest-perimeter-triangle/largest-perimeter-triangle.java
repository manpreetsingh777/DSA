class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max =0;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=i+2;
            if(nums[i] + nums[j] <= nums[k]){
                continue;
            }
            else {
                max = nums[i] + nums[j] + nums[k];
            }
        }
        return max;
    }
}