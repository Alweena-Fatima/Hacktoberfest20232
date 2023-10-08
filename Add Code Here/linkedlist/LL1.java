
//*ALGORITHM
/*
 Algorithm to Find Maximum Value in a Linked List:

*Initialize max to Integer.MIN_VALUE to represent the minimum possible integer value.
*Initialize temp as the head of the linked list.
*While temp is not null, repeat the following steps:
*If the value of temp.data is greater than max, update max with the value of temp.data.
*Move temp to the next node in the linked list.
*Return max as the maximum value found in the linked list.

Algorithm to Find Minimum Value in a Linked List:

*Initialize min to Integer.MAX_VALUE to represent the maximum possible integer value.
*Initialize temp as the head of the linked list.
*While temp is not null, repeat the following steps:
*If the value of temp.data is less than min, update min with the value of temp.data.
*Move temp to the next node in the linked list.
*Return min as the minimum value found in the linked list.
 */
public class LL1 {
    public static void main(String[] args) {
        // taking linked list from class LL
        Node head = LL.insert();

        LL.printLL(head);

        System.out.println("\nMAXIMUM : " + maximum(head));
        System.out.println("\nMINIMUM : " + minmum(head));
    }

    public static int maximum(Node head) {
        int max = Integer.MIN_VALUE;
        Node temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }

    public static int minmum(Node head) {
        int min = Integer.MAX_VALUE;
        Node temp = head;
        while (temp != null) {
            if (temp.data < min) {
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }
}
