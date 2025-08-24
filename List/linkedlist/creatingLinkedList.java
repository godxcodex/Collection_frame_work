package List.linkedlist;

public class creatingLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static class insertAtEnd{
    Node head = null;
    Node tail = null;
    public void add(int a){
        Node temp = new Node(a);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    public int display(){
        Node temp = head;
        int count =0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    } 
        
    }

    public static void main(String[] args) {
     insertAtEnd List1 = new insertAtEnd();
     List1.add(22);
     List1.add(34);
     List1.add(45);
     System.out.println(List1.display());
    }
}