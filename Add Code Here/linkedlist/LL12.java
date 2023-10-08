//* INTERSECTION Y SHAPED */
public class LL12 {
    public static Node findYnode(Node head1, Node head2) {
        int l1 = size(head1);
        int l2 = size(head2);
        int diff = Math.abs(l1 - l2);
        Node longerList = (l1 > l2) ? head1 : head2;
        Node shorterList = (l1 > l2) ? head2 : head1;
        // Traverse the longer list by 'diff' nodes
        for (int i = 0; i < diff; i++) {
            longerList = longerList.next;
        }
        // Traverse both lists in parallel until a common node is found
        while (longerList != null && shorterList != null) {
            if (longerList == shorterList) {
                return longerList; // Found the intersection node
            }
            longerList = longerList.next;
            shorterList = shorterList.next;
        }
        return null; // No intersection found
    }
    public static int size(Node head) {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);

        Node head2 = new Node(7);
        head2.next = head1.next.next; // Joining point in Y shape

        System.out.println("List 1:");
        printList(head1);

        System.out.println("List 2:");
        printList(head2);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


