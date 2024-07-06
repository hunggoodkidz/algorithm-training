package Leetcode.LinkedList;



public class ReversedLinkedList {


    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode current = head;
        ListNode nextNode = null;
        while (current != null) {
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        current = prevNode;
        return current;
    }



    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Printing original linked list
        System.out.println("Original linked list:");
        printLinkedList(head);

        // Reversing the linked list
        ReversedLinkedList solution = new ReversedLinkedList();
        ListNode reversedHead = solution.reverseList(head);

        // Printing reversed linked list
        System.out.println("\nReversed linked list:");
        printLinkedList(reversedHead);
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }


}
