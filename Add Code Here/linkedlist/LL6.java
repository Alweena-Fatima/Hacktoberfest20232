//REVERSEING USING TWO POINTERS
//ALGORITHM
/*
 * Initialize prev to null // Initialize the previous pointer to null.
*Initialize curr to head.
*Initialize temp to null. // temp will store the next of current.
*While curr is not null, repeat the following steps.
*a. Save the next node of curr in temp to preserve the rest of the list.
*b. Set the next of curr to prev. // Linking current's next to the prev link, which is null.
*c. Update prev to curr to prepare for the next iteration.
*d. Update curr to temp to move to the next node in the original list.
*After the loop, update the head to prev because prev now points to the new head of the reversed list.
*Finally, return the new head of the reversed linked list.
 */
public class LL6 {
    public static void main(String[] args) {
        Node head=LL.insert();
        LL.printLL(head);
        head=reversetwopointer(head);
        LL.printLL(head);
    }
    public static Node reversetwopointer(Node head){
        Node prev = null;  // Initialize the previous pointer to null
        Node curr = head;
        Node temp=null;//temp will store the next of current
        while ((curr!=null)) {
            temp=curr.next;
            curr.next=prev;
            //linking curr next to the prev link which is null
            prev=curr;
            //now update the current to its next pointer which is temp
            curr=temp;   
        }
        head=prev;
        return head;
    }

}
