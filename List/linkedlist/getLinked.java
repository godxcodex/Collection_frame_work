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
         if(idx == size){
            tail.next = ne;
            tail = ne;
            size++;
            return;
        }
        if(idx ==0){
            ne.next = head;
            head = ne;
            size++; 
            return; 
        }
        for(int i=1;i<=idx;i++){
            ne = ne.next; 
        }
        temp.next = ne.next;
        ne.next = temp;
        size++;
      }  
      void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
      }
    }
    public static void main(String[] args) {
        
    }
    
}
