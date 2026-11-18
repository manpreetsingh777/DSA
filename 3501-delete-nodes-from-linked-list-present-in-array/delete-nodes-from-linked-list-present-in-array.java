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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        ListNode first = null;
        ListNode cur = null;
        ListNode temp = head;
        while(temp != null){
            int val = temp.val;
            if(!set.contains(val)){
                if(first == null){
                    first = temp;
                    cur = temp;
                    temp = temp.next;
                }
                else {
                    cur.next = temp;
                    cur = temp;
                    temp = temp.next;
                }
            }
            else {
                temp = temp.next;
            }
        }
        if(cur != null)cur.next = null ;
        return first;
    }
}