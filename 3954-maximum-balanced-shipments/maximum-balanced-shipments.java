class Solution {
    public int maxBalancedShipments(int[] weight) {
      int  n = weight.length;
      int cnt = 0;
      Stack<Integer> s = new Stack<>();
      for(int i=0;i<n;i++){
        int cur = weight[i];
        if(s.isEmpty()){
            s.push(cur);
        }
        else if(cur < s.peek()){
            cnt++;
            while(!s.isEmpty()){
                s.pop();
            }
        }
        else {
            s.push(cur);
        }
      }
      return cnt;
    }
}