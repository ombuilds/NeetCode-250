/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }

        HashMap<ListNode,Boolean> visited=new HashMap<>();
        ListNode temp=head;

        while(temp!=null){
            if(visited.containsKey(temp)){
                return true;
            }
            visited.put(temp,true);
            temp=temp.next;
        }
        return false;
    }
}