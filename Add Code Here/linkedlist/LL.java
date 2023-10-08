import java.util.Scanner;

public class LL {
    public static void main(String[] args) {
        Node head=insert();
        printLL(head);
    }
    static int length=0;
    public static void printLL(Node root) {
        Node temp = root;
        while (temp != null) {
            length++;
            System.out.print("| " + temp.data + " |  --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node insert() {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data you want to insert :");
        int val = sc.nextInt();

        while (val != 00) {
            Node current_Node = new Node(val);
            if (root == null) {
                root = current_Node;
            }
            // keep the track of each current node as tail as we have to insert our next
            // data in the last node
            else {
                Node tail = root;
                // traverse till we reach at the pos where at we want to insert
                while (tail.next != null) {
                    tail = tail.next;
                }
                // now tail is pointing to the last node, insert the current node
                tail.next = current_Node;
            }
            val = sc.nextInt();

        }
        return root;

    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        // this.next = null;
    }
}