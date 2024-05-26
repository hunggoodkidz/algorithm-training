package Leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Creating a linked list with a cycle
        ListNode headWithCycle = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        headWithCycle.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1; // This creates a cycle

        LinkedListCycle cycleDetector = new LinkedListCycle();
        boolean hasCycle = cycleDetector.hasCycle(headWithCycle);
        System.out.println("Linked list has cycle: " + hasCycle);

        // Creating a linked list without a cycle
        ListNode headWithoutCycle = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        headWithoutCycle.next = node4;
        node4.next = node5;
        node5.next = node6;

        hasCycle = cycleDetector.hasCycle(headWithoutCycle);
        System.out.println("Linked list has cycle: " + hasCycle);
    }
}
