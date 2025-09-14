package List.linkedlist;

public class deleteIdx {
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

        void add(int var) {
            Node temp = new Node(var);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void deleteAtidx(int idx) {
            if (idx < 0 || head == null)
                return;

            // Delete head
            if (idx == 0) {
                head = head.next;
                if (head == null)
                    tail = null;
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                if (temp.next == null || temp.next.next == null)
                    return; // index out of bounds
                temp = temp.next;
            }

            // Delete tail
            if (temp.next == tail) {
                temp.next = null;
                tail = temp;
            } else {
                temp.next = temp.next.next;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.add(33);
        l1.add(56);
        l1.add(42);
        l1.add(89);
        l1.add(72);
        l1.display();
        l1.deleteAtidx(0);
        System.out.println();
        l1.display();
        System.out.println();
        System.out.println(l1.head.data);
        l1.deleteAtidx(4);
        System.out.println(l1.tail.data);
        l1.deleteAtidx(3);
        System.out.println(l1.tail.data);

    }

}
