//*THIRD LARGEST NODE */
/*
 ALGORITHM 
*Initialize three variables first, second, and third to null.
*Initialize a current node to the head of the linked list.
*Iterate through the linked list:
*If the current node's data is greater than the value in first, update third with the value in second, second with the value in first, and first with the current node's data.
*Else, if the data is greater than the value in second but not greater than the value in first, update third with the value in second, and second with the current node's data.
*Else, if the data is greater than the value in third but not greater than the value in second, update third with the current node's data.
*Move to the next node.
*Return the value in the third variable as the third largest element.
 */
public class LL14 {
    public static void main(String[] args) {
        Node head = LL.insert();
        LL.printLL(head);
        System.out.println("Third largest number of the given linked list is :" + findTL(head));
    }

    public static int findTL(Node head) {
        if (head == null || head.next == null) {
            return -1;
        }
        int FL = Integer.MIN_VALUE;
        int SL = Integer.MIN_VALUE;
        int TL = Integer.MIN_VALUE;

        Node current = head;
        while (current != null) {
            int data = current.data;

            if (data > FL) {
                TL = SL;
                SL = FL;
                FL = data;
            } else if (data > SL && data < FL) {
                TL = SL;
                SL = data;
            } else if (data > TL && data < SL) {
                TL = data;
            }

            current = current.next;
        }

        return TL;
    }

}
