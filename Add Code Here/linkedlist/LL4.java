//* DELETE THE LINKED LIST */
public class LL4 {
    public static void main(String[] args) {
        Node head=LL.insert();
        System.out.println("Original LL\n");
        LL.printLL(head);
         System.out.println();
        System.out.println("After deleteing \n");
        head=deleteLL(head);
       
        LL.printLL(head);
    }
    public static Node deleteLL(Node head){
        head=null;
        return head;
    }
}
