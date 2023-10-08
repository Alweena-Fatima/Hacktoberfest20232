//DELETE ALTERNATE NODE 
//ALGORITHM 
/*
* 1 Start with the head of the linked list.
* 2 Check if the linked list is empty (head is null) or has only one node (head.next is null).
* 3 If either condition is true, return the head as there's nothing to delete.
* 4 Initialize a pointer 'current' to the head of the linked list.
* 5 Use a while loop to traverse the linked list until 'current' or 'current.next' becomes null:
*  a. Check if 'current.next' is not null. This ensures that there are at least two nodes to delete alternates.
*  b. Update the 'next' reference of the 'current' node to skip the next node. Essentially, set 'current.next' to 'current.next.next'.
*  c. Move 'current' to the node after the deleted node by setting 'current' to 'current.next'.
* 6 After the loop completes, return the head of the linked list, which will be the original head after alternate nodes have been deleted.
 */
public class LL21 {
    public static void main(String[] args) {
        Node head=LL.insert();
        LL.printLL(head);
        head=delalternate(head);
        LL.printLL(head);
    }
    public static Node delalternate(Node head){
        if(head.next==null || head==null){
            return null;
        }
        Node current = head;
        while (current != null && current.next != null) {
            current.next = current.next.next; // Skip the next node.
            current = current.next; // Move to the next node.
        }
        return head;
    }
}
