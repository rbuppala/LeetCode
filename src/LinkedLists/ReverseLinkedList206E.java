package LinkedLists;
/*
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList206E {

    public static void main(String args[]) {
        ListNode headNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);

        secondNode.next = thirdNode;
        headNode.next = secondNode;

        ListNode newHead = reverseList(headNode);

        while(newHead != null) {
            System.out.print(newHead.val);
            newHead = newHead.next;
        }
    }
    /*
    Assume that we have linked list 1 → 2 → 3 → Ø, we would like to change it to Ø ← 1 ← 2 ← 3.
    While you are traversing the list, change the current node's next pointer to point to its previous element.
    Since a node does not have reference to its previous node, you must store its previous element beforehand.
     You also need another pointer to store the next node before changing the reference.
     Do not forget to return the new head reference at the end!
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }


}




