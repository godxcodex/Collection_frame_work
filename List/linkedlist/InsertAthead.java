package List.linkedlist;

public class InsertAthead {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAt_head(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;

            }
        }
        void display(){
            Node temp = head;
         while(temp!=null){
            System.out.println(temp.data);
             temp = temp.next;
         }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAt_head(3);
        ll.insertAt_head(33);
        ll.insertAt_head(44);
        ll.insertAt_head(555);
        ll.display();
    }
}