//KTH NODE EFROM THE END
//ALGORITHM
/*
 *Print the length of the linked list (LL.length) to determine the total number of nodes.
 *Calculate the index (position from the beginning) of the k-th node from the end
 *Initialize a temporary pointer (temp) to the head of the linked list.
 *Initialize a position counter (pos) to 1.
 *Use a while loop to traverse the linked list until one of the following conditions is met:
 *temp becomes null (indicating the end of the list has been reached).
 *The position (pos) is equal to the calculated index.
   * Check if pos is equal to the calculated index. If they are equal
 *Move the temporary pointer (temp) to the next node by setting temp to temp.next.
 */
import java.util.Scanner;
public class LL11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking linked list from class LL
        Node head=LL.insert();
        LL.printLL(head);
         System.out.println("Enter the K : ");
        kth_from_End(head,sc.nextInt());
    }
    
    public static void kth_from_End(Node head, int k){
        System.out.println("Length :" +LL.length);
        int index=LL.length - k;
        Node temp = head;
        int pos=1;
        while (temp!=null && pos-1!=index) {
           
            if(pos==index){
                System.out.println("Node at the postion "+k+" from the last is : "+temp.data);
              
            }
             pos++;
            temp=temp.next;
            
            
        }
      
    }
}
