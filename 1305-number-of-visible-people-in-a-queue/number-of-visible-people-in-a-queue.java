class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            int cur = heights[i];
            if(s.isEmpty()){
                ans[i] = 0;
                s.push(cur);
            }
            else if(s.peek() >= cur){
                ans[i] = 1;
                s.push(cur);
            }
            else {
               while(!s.isEmpty() && cur > s.peek()){
                ans[i]++;
                s.pop();
               }
               if(!s.isEmpty()){
                ans[i]++;
               }
               s.push(cur);
            }
        }
        return ans;
    }
}