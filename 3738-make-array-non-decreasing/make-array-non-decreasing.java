class Solution {
    public int maximumPossibleSize(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            int cur = nums[i];
            if(s.isEmpty()){
                s.push(cur);
            }
           else if(cur<s.peek())continue;
           else {
           s.push(cur);
           }
        }
        return s.size();
    }
}