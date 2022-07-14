package practice;

public class MiddleOfLinkedList {
    public static class LinkedList {
        Node head = null;

        class  Node {
            int data;
            Node next;

            Node(int d) {
                this.data = d;
            }
        }

        public void push(int n) {

            Node n1 = new Node(n);
            n1.next = null;

            if(head == null) {
                head = n1;
                return;
            }
           else {
                Node temp = head;
                while(temp.next != null){
                    temp= temp.next;
                }
                temp.next = n1;
            }
        }

        public void printLinkedList(){
            Node temp = head;
//            System.out.print(temp.data + " ");

            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }
        public int middle(){
            Node fast=head,slow=head;
            while(fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }

    }

    public static void main(String[] args) {
        System.out.println("hello");
        LinkedList l1 =  new LinkedList();
        l1.push(1);
        l1.push(2);
        l1.push(3);
        l1.printLinkedList();
        System.out.println("\n" + l1.middle());

    }
}
