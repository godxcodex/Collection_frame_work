package List.linkedlist;

public class getLinked {
    public static class Node {
    int data;
    Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist {
    Node head = null;
    Node tail = null;
    int size=0;
     void add(int val){
      Node temp = new Node(val);
      if(head == null){
        head = temp;
        tail = temp;
        size++;
      }
      else{
        tail.next = temp;
        tail = temp;
     }
    }
      void addAt (int idx,int val){
        Node temp = new Node(val);
        Node ne = head;
        for(int i=1;i<=idx;i++){
            ne = ne.next; 
        }
        temp.next = ne.next;
        ne.next = temp;
        size++;
      }  
    }
    public static void main(String[] args) {
        
    }
    
}
