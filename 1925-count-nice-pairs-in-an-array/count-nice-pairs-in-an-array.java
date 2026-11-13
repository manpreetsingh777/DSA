class Solution {
    public int countNicePairs(int[] nums) {
       int n = nums.length;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<n;i++){
        int num = nums[i];
        int rev = reverse(num);
        int dif = num - rev;
        map.put(dif,map.getOrDefault(dif,0)+1);
       }
       long cnt=0;
       for(int j:map.values()){
       cnt = (cnt + (long ) j * (j - 1) / 2) % 1000000007;
       }
       return (int)cnt;
    }
    private int reverse(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
             sum = sum * 10 + digit;
            n /= 10;
        }
        return sum;
    }
}