class Solution {
    public int[] findArray(int[] pref) {
      int n = pref.length;
      int xor = pref[0];
      int cur = 0;
      for(int i=1;i<n;i++){
        cur = pref[i];
        pref[i] = xor ^ pref[i];
        xor = cur;
      }
      return pref;
    }
}