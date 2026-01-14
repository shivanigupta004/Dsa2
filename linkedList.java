public class linkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step1-creation of new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 - newnode next = head
        newNode.next = head;     //linling
        //step3 - head = newnode
        head = newNode;
    }
    public void addLast(int data){
        //step1-creation of new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 - tail next = newNode
        tail.next = newNode;    //linling
        //step3 - head = newnode
        tail = newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("Linked List is empty.");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedList ll =  new linkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}