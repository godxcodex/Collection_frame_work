package List.linkedlist;

public class addIndex {
    public static class Node {
    int data ;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public static class linkedlist{
    Node head = null;
    Node tail = null;
    void add(int var){
        Node temp = new Node(var);
        if(head==null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    void addAtIndex(int idx,int val){
        Node ne = new Node(val);
        Node temp = head;
        
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        ne.next = temp.next;
        temp.next = ne; 
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    int size(){
        int count=0;
        Node temp = head;
        while(temp !=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.add(33);
        list.add(45);
        list.add(54);
        list.add(78);
       // list.display();
        list.addAtIndex(2, 93);
        list.display();

    }
    
}
