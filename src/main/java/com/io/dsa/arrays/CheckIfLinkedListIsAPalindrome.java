package com.io.dsa.arrays;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class CheckIfLinkedListIsAPalindrome {

    public static boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }

        ListNode mid = findMiddle(head);
        ListNode last = reverse(mid);
        ListNode cur = head;

        while (last != null) {
            if (last.val != cur.val) {
                return false;
            }
            last = last.next;
            cur = cur.next;

        }
        return true;
    }

    public static ListNode reverse(ListNode head) {

        if(head == null||head.next == null)
            return head;

        ListNode prev = null;

        while (head != null) {
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }

        return prev;

    }

    public static ListNode findMiddle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);

        l1.next = l2;
        l2.next = null;

        System.out.println(isPalindrome(l1));
    }
}
