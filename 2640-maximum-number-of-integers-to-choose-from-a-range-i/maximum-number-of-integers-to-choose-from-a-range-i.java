class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
    HashSet<Integer> set = new HashSet<>();
    for(int i=0;i<banned.length;i++){
        set.add(banned[i]);
    }
    int sum = 0;
    int j=1;
    int cnt =0;
    while(j<=n && sum+j <= maxSum ){
        if(!set.contains(j)){
            sum += j;
            cnt++;
        }
        j++;
    }
    return cnt;
    }
}