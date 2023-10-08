//*REVERSE
// *ALGORITHM
/*

*Create a recursive function rev that takes a Node as input and reverses the linked list from that node onwards.

*Initialize temp as the head of the linked list.

*If temp is null or temp.next is null (indicating an empty list or a list with only one node), return temp. There is nothing to reverse in this case.

*Otherwise, call the rev function recursively with temp.next as the argument. This recursive call will reverse the linked list starting from the second node onwards.
*If temp is the first node, the recursion will reverse the rest of the list (from the second node).
*temp.next.next = temp will reverse the connection, making temp the new tail of the reversed list.
*temp.next = null will break the link from the original temp node to the next node, effectively making it the new head of the reversed list.

*Return small_temp, which is the new head of the reversed list
 */
public class LL5 {
    public static void main(String[] args) {
        Node head = LL.insert();
        Node temp = head;
        LL.printLL(temp);
        head = rev(head);
        LL.printLL(head);
    }

    public static Node rev(Node head) {
        Node temp = head;
        if (temp == null || temp.next == null) {
            return temp;
        }
        Node small_temp = rev(temp.next);// this much will reverse till 24
        // METHOD 1
        temp.next.next = temp;// temp.next.next is the next of tail of reverse linked list that is next part

        temp.next = null;// point original temp to null
        return small_temp;
    }

}
