//DELETE THE GIVEN NODE FROM THE LINKEDLIST
//ALGORITHM
/*
* Start with the head of the linked list.
* Create a reference (temp) to the node you want to delete.
* To delete the node, copy the data of the next node (temp.next) to the data of the current node (temp.data).
* Update the 'next' reference of the current node (temp) to skip the next node. Essentially, set 'temp.next' to 'temp.next.next'.
* The node has now been effectively deleted from the linked list.
 */
public class LL20 {
    public static void main(String[] args) {
        Node head = LL.insert();
        LL.printLL(head);
        Node temp = head.next.next;//3rd node
        deleteNode(temp);
        LL.printLL(head);
    }
    public static void deleteNode(Node del)
    {
         del.data=del.next.data;
         del.next=del.next.next;
        
    }
}
