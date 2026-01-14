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
    public static int size;

    public void addFirst(int data){
        //step1-creation of new node
        Node newNode = new Node(data);
        size++;
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
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 - tail next = newNode
        tail.next = newNode;    //linling
        //step3 - head = newnode
        tail = newNode;
    }
    public void add(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print();
        System.out.println("Size of linked list: " + size);
    }
}