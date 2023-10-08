//* REVERSE IN PAIR */
public class LL9 {
    public static void main(String[] args) {
        Node head=LL.insert();
        LL.printLL(head);
        head=revpair(head);
        LL.printLL(head);


    }
    public static Node revpair(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node current = head;
        Node next=null;
        int count = 0;

        while (current != null && count < 2) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = revpair(next);
        }

        return prev;
    }
}
