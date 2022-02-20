/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
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
    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode();
        while(head!= null){
            ListNode temp = new ListNode();
            temp.val = head.val;
            temp.next = result.next;
            result.next = temp;
            head = head.next;
        }
        return result.next;
    }
}
// @lc code=end

