package List.linkedlist;

public class printing_list {
    public static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);//head
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16); // tail

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp = a;
        while(temp != null){
           System.out.print(temp.data +" ");
           temp = temp.next;
        }
    }
}
