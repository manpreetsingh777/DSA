class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
       int n = nums.length;
       HashSet<Integer> set = new HashSet<>();
       int ind = n/2;
       for(int i=0;i<n;i++){
        if(i==ind)continue;
        set.add(nums[i]);
       }
       if(set.contains(nums[ind]))return false;
       return true;
    }
}