//REMOVE THE LAST OCCURANCE 
//ALGORITHM
/*
 *Initialize three pointers: prev, curr, and keyprev.

prev will keep track of the node before the current node.
curr will be used to traverse the list.
keyprev will keep track of the node before the last occurrence of the target item.
*Traverse the linked list using a while loop:
If the data in the current node (curr.data) is equal to the target key, update keyprev to point to the node before the last occurrence of the target item.
Update prev to curr and move curr to the next node.
*After the traversal, if keyprev is still null, it means that the target item was not found in the list.
In this case, return the original head of the list.
*If keyprev is not null, it indicates that the target item was found in the list, and keyprev points to the node before the last occurrence.
*To remove the last occurrence of the target item, update keyprev.next to point to the node after the last occurrence of the target item (keyprev.next.next).

*Return the modified linked list (the head of the list).
 */
public class LL15 {
    public static void main(String[] args) {
        Node head = LL.insert();
        LL.printLL(head);
        head = delLocc(head, 4);
        LL.printLL(head);
    }

    public static Node delLocc(Node head, int key) {
        Node prev = null;
        Node curr = head;
        Node keyprev = null;

        while (curr != null) {
            if (curr.data == key) {
                keyprev = prev;
            }
            prev = curr;
            curr = curr.next;
        }

        if (keyprev == null) {
            return head;
        }
        // Remove the last occurrence of the key item.
        keyprev.next = keyprev.next.next;
        return head;

    }
}
