//DELETE THE MIDDLE NODE 
/*
 * Steps

* - Start with the head of the linked list.
* - Check if the linked list is empty (head is null) or has only one node (head.next is null). If either condition is true, return null (there's no middle node to delete).
* - Initialize three pointers: 'fast', 'slow', and 'prev'. Set all of them to the head of the linked list.
* - Use a loop to traverse the linked list:
* - a. While 'fast' is not null and 'fast.next' is not null (ensuring there are at least two nodes to find the middle):
* - i. Update 'prev' to 'slow'.
* - ii. Move 'fast' two steps (fast = fast.next.next).
* - iii. Move 'slow' one step (slow = slow.next).
* - After the loop, 'prev' will be pointing to the node just before the middle node.
* - To delete the middle node, update 'prev.next' to 'prev.next.next' (skipping the middle node).
* - Return the head of the modified linked list.
 */
public class LL18 {
    public static void main(String[] args) {
        Node head = LL.insert();
        Node temp = head;
        LL.printLL(temp);
        head=deleteMid(head);
        LL.printLL(head);
        
    }
    public static Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head==null || head.next==null){
            return null;
        }
        
        Node fast= head;
        Node slow=head;
        Node prev=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
            
        }
        //now prev will point to slow that is middle of the LL after above iteration
        prev.next=prev.next.next;
        return head;
    }
}
