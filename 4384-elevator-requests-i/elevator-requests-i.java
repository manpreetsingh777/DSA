class Solution {
    public int elevatorRequests(int n, int[] requests) {
       int len = requests.length;
       int t = 0;
       int cur = 0;
       for(int i=0;i<len;i++) {
            int time = Math.abs(cur - requests[i]);
            t += time ;
            cur = requests[i];
       }
       return t;
    }
}