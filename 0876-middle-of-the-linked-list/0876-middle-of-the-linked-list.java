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
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        else{
            int size=1;
            ListNode curr=head;
            while(curr.next!=null){
                curr=curr.next;
                size++;
            }
            // if(size%2==0){
            //     int n=(size/2)+1;
            // }
            // else if(size%2!=0){
            //     int n=(size/2)+1;
            // }
            ListNode temp=head;
            for(int i=1;i<(size/2)+1;i++){
                temp=temp.next;
            }

            return temp;      
            
        }
    }
}