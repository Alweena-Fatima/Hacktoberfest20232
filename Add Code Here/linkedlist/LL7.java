
//DELETE N NODE AFTER EVERY M NODE 
//ALGORITH
/*
 * Start with a pointer curr at the head of the linked list.

*While curr is not null, repeat the following steps:
*a. Step 1: Move to the 'M' node before starting the deletion process:
*Use a for loop to iterate 'i' from 1 to 'M - 1' and move 'curr' to the 'M'-th node (the node just before the sequence to be deleted).
*b. Check if 'curr' is null. If it's null, break the loop because there are no more nodes to process.
*c. Step 2: Start deleting 'N' nodes:
*Create a temporary pointer temp and set it to the node immediately after 'curr'.
*d. Use a for loop to iterate 'i' from 1 to 'N' and move 'temp' 'N' nodes ahead (positioning temp at the node after the last node that needs to be deleted).*
*e. Step 3: Link the current node to the node after the 'N' nodes:
*Set the 'next' reference of 'curr' to 'temp'. This effectively bypasses the 'N' nodes to delete them.
*f. Step 4: Move to the next node after the deleted nodes:
*Update 'curr' to 'temp', which is now pointing to the node immediately after the 'N' nodes that have been deleted.
*After the loop, return the head of the modified linked list.
 */
import java.util.Scanner;

public class LL7 {
    public static void main(String[] args) {
        Node head = LL.insert();
        LL.printLL(head);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter M :");
        int M = sc.nextInt();

        System.out.println("Enter N :");
        int N = sc.nextInt();
        head = linkdelete(head, M, N);
        LL.printLL(head);
    }

    public static Node linkdelete(Node head, int M, int N) {
        Node curr = head;

        while (curr != null) {
            // Step 1: Move to the 'm' node before starting the deletion process
            for (int i = 1; i < M && curr != null; i++) {
                curr = curr.next;
            }
            // after this loop curr will points to immediate previous node after with
            // deletation start
            if (curr == null) {
                break;
            }
            // Step 2: Start deleting 'n' nodes
            Node temp = curr.next;
            for (int i = 1; i <= N && temp != null; i++) {
                temp = temp.next;
            }
            // now temp is pointing to n+1th node deletations ends at nth node
            // Step 3: Link the current node to the node after the 'n' nodes
            curr.next = temp;

            // Step 4: Move to the next node after the deleted nodes
            curr = temp;

        }
        return head;
    }
}
