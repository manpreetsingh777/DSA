class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low = 1;
        int high = position[n-1] - position[0];
        int ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(ispos(position, mid,m) == true){
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
    private boolean ispos(int[] position,int k,int m){
        int last = position[0];
        int cur = m - 1;
        for(int i=1;i<position.length;i++){
            if(position[i] - last >= k ){
                cur--;
                last = position[i];
            }
            if(cur<=0)return true;
        }
        if(cur<=0)return true;
        return false;
    }
}