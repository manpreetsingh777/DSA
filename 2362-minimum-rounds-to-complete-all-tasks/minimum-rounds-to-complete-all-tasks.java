class Solution {
    public int minimumRounds(int[] tasks) {
        int n = tasks.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int round = 0;
        for(Integer j:map.values()){
            if(j==1)return -1;
            else {
                round += (j+2)/3;
            }
        }
        return round;
    }
}