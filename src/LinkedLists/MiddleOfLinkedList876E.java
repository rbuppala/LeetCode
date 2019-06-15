package LinkedLists;

/*
876. Middle of the Linked List

Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.

Example 1:

Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
Example 2:

Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.

 */
public class MiddleOfLinkedList876E {

    public static void main(String args[]) {
        ListNode headNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);

        secondNode.next = thirdNode;
        headNode.next = secondNode;
        System.out.println(middleNode(headNode).val);
        System.out.println(middleNodeTwoPointer(headNode).val);
    }

    /*
        Approach 1: Output to Array
        Put every node into an array A in order.
        Then the middle node is just A[A.length // 2], since we can retrieve each node by index.
        Time Complexity: O(N)
        Space Complexity: O(N), the space used by Array.
     */
    public static ListNode middleNode(ListNode head) {
        ListNode[] array = new ListNode[100];
        int i = 0;
        while (head.next != null) {
            array[i++] = head;
            head = head.next;
        }
        return array[i / 2];
    }

    /*
        When traversing the list with a pointer slow, make another pointer fast that traverses twice as fast.
        When fast reaches the end of the list, slow must be in the middle.
        Time Complexity: O(N)
        Space Complexity: O(1) the space used by slow and fast.
     */
    public static ListNode middleNodeTwoPointer(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}


