public class LL2 {
    public static void main(String[] args) {
        Node head=LL.insert();
        LL.printLL(head);
        head=oddeven(head);
        LL.printLL(head);
    }
    public static Node oddeven(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node Ofirst = null;
        Node Olast = null;
        Node Efirst = null;
        Node Eend = null;

        Node curr = head;

        while (curr != null) {
            if (curr.data % 2 != 0) { // Odd number
                if (Ofirst == null) {
                    Ofirst = curr;
                    Olast = curr;
                } else {
                    Olast.next = curr;
                    Olast = curr;
                }
            } else { // Even number
                if (Efirst == null) {
                    Efirst = curr;
                    Eend = curr;
                } else {
                    Eend.next = curr;
                    Eend = curr;
                }
            }
            curr = curr.next;
        }

        if (Ofirst == null) {
            // All even numbers, return Efirst
            return Efirst;
        } else {
            Olast.next = Efirst;
            Eend.next = null;
            return Ofirst;
        }
    }
}
