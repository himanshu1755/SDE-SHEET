//package practice;
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// * int val;
// * ListNode next;
// * ListNode() {}
// * ListNode(int val) { this.val = val; }
// * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode head = null;
//        ListNode lastNode = new ListNode();
//
//        int remainder = 0;
//
//        while (l1 != null && l2 != null) {
//            int number = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + remainder;
//
//            remainder = number / 10;
//
//            if (remainder != 0) {
//                number = number % 10;
//            }
//
//            //base case
//            if (head == null) {
//                ListNode temp = new ListNode();
//                int value = number + remainder;
//                remainder = 0;
//                remainder = number / 10;
//                if (remainder != 0) {
//                    number = number % 10;
//                }
//
//                temp.val = number;
//                temp.next = null;
//                head = temp;
//                lastNode = head;
//            } else {
//                ListNode temp = new ListNode();
//                int value = number;
//
//                temp.val = number;
//                temp.next = null;
//                lastNode.next = temp;
//                lastNode = lastNode.next;
//            }
//            if (l1 != null)
//                l1 = l1.next;
//            if (l2 != null)
//                l2 = l2.next;
//        }
//
//
//        return head;
//    }
//}