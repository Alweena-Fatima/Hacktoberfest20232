//FREQUENCY OF EACH NODE 
//ALGORITHM 
/*
* 1 Start with the head of the linked list.
* 2 Check if the linked list is empty. If it is, print "List is empty," and exit.
* 3 Initialize a current pointer to the head of the linked list.
* 4 Loop through the linked list until the current pointer is not null:
  *      a. Get the data value of the current node (curr_data).
   *     b. Initialize a variable (currdata_freq) to 0 to store the frequency of curr_data.
    *    c. Create a temporary pointer (temp) and initialize it to the head of the linked list.
     *   d. While the temp pointer is not null:
      *     i. If the data of the temp node is equal to curr_data, increment currdata_freq.
    *       ii. Move the temp pointer to the next node.
     *   e. Print "Frequency of curr_data is currdata_freq."
    *    f. Move the current pointer (curr) to the next node that has a different data value (i.e., skip nodes with the same data).
*Repeat steps 4 and 5 until all elements in the linked list have been processed.

 */
public class LL25 {
    public static void main(String[] args) {
        Node head=LL.insert();
        LL.printLL(head);
        freq(head);
    }
    public static void freq(Node head){
        if(head==null){
            System.out.println("List is empty");
        }
        Node curr=head;
        while(curr!=null){
            int curr_data=curr.data;
            int currdata_freq=0;
            // Count the frequency of the current data value
            Node temp = head;
            while (temp != null) {
                if (temp.data == curr_data) {
                    currdata_freq++;
                }
                temp = temp.next;
            }
            System.out.println("Frequency of "+curr_data+" is "+currdata_freq);
            //moving the pointer current to the next pointer 
            while (curr!=null && curr.data==curr_data) {
                curr=curr.next;
            }
        }
    }
}
