package List.linkedlist;

public class first_linked {
    public static class Node{
        int data ;// value 
        Node next;// address of next node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(22);
        System.out.println(a.next);
        Node b = new Node(54);
        Node c = new Node(35);
        Node d = new Node(32);
        Node e = new Node(85);
        // 22 54 35 32 85
        a.next = b; // 22->54 35 32 85
        b.next = c;//  22->54->35 32 85
        c.next = d; //22->54->35->32 85
        d.next = e;// 22->54->35->32->85
        System.out.println(a.next);
    }
}
