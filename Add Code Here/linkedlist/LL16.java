public class LL16 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Creating a cycle

        System.out.println("Has cycle: " + isLoop(head));

        Node start_of_loop = loop(head);
        if (start_of_loop != null) {
            System.out.println("Loop start at : " + start_of_loop.data);
            removeloop(head);
        }

        System.out.println("After removing the cycle, has cycle: " + isLoop(head));
    }
    public static boolean isLoop(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static Node loop(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                fast = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }

    public static void removeloop(Node head) {
        Node start_of_loop = loop(head);
        if (start_of_loop == null) {
            return; // No cycle found
        }

        Node current = head;
        while (current.next != start_of_loop) {
            current = current.next;
        }
        current.next = null;
    }
}
