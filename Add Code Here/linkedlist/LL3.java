//* FIND UNION AND INTERSECTION */
public class LL3 {
    public static void main(String[] args) {
        Node head1=LL.insert();
        Node head2=LL.insert();
        Node head=findIntersection(head1, head2);
        System.out.println("Union");
        LL.printLL(head);
        Node root=findIntersection(head2, head);
        System.out.println("Intersection ");
        LL.printLL(root);
    }
    public static Node findUnion(Node ll1, Node ll2) {
        if (ll1 == null && ll2 == null) {
            return null;
        }
        if (ll1 == null) {
            return ll2;
        }
        if (ll2 == null) {
            return ll1;
        }
        Node result = new Node(0);
        Node current = result;
        while (ll1 != null || ll2 != null) {
            if (ll1 != null && ll2 != null && ll1.data == ll2.data) {
                current.next = new Node(ll1.data);
                ll1 = ll1.next;
                ll2 = ll2.next;
            } else if (ll1 != null && (ll2 == null || ll1.data < ll2.data)) {
                current.next = new Node(ll1.data);
                ll1 = ll1.next;
            } else {
                current.next = new Node(ll2.data);
                ll2 = ll2.next;
            }
            current = current.next;
        }
        return result.next;
    }
    public static Node findIntersection(Node ll1, Node ll2) {
        if (ll1 == null || ll2 == null) {
            return null;
        }
        Node result = new Node(0);
        Node current = result;

        while (ll1 != null && ll2 != null) {
            if (ll1.data == ll2.data) {
                current.next = new Node(ll1.data);
                current = current.next;
                ll1 = ll1.next;
                ll2 = ll2.next;
            } else if (ll1.data < ll2.data) {
                ll1 = ll1.next;
            } else {
                ll2 = ll2.next;
            }
        }
        return result.next;
    }

}
