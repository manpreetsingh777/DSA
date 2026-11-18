/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        int prev = temp.val ;
        temp = temp.next;
        int i=1;
        while(temp != null && temp.next != null ){
            int cur = temp.val;
            int next = temp.next.val;
            if( cur > prev && cur > next){
                list.add(i);
            }
            else if(cur < prev && cur < next)list.add(i);
            prev = cur;
            temp = temp.next;
            i++;
        }
        int max = -1;
        if(list.size()>=2){
            max = list.get(list.size() - 1) - list.get(0);
        }
        int min = Integer.MAX_VALUE;
        for(int j=1;j<list.size();j++){
            min = Math.min(min, list.get(j) - list.get(j-1));
        }
        if(min != Integer.MAX_VALUE)ans[0] = min;
        else{
            ans[0] = -1;
        }
        ans[1] = max;
        return ans;
    }
}