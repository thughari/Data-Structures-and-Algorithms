package LinkedList;

public class SingleLinkedList {
    private int length;
    private Node head;
    private Node tail;

   static class Node{
        public int value;
        public Node next;
       public Node(int value) {
           this.value = value;
           this.next = null;
       }
   }
    public SingleLinkedList(int value) {
       Node newNode= new Node(value);
        this.length =1;
        this.head = newNode;
        this.tail = newNode;
    }
    public void printList(){
        Node temp=head;
       while (temp!=null){
           System.out.println(temp.value);
           temp=temp.next;
       }
    }
    public void append(int value){
        Node newNode= new Node(value);
        tail.next=newNode;
        this.tail =newNode;
        length++;
    }

    public void prepend(int value){
       Node newNode = new Node(value);
       newNode.next = head;
       head = newNode;
       length++;
    }

    public Node get(int index){

       if(index < 1 || index>=length-1){
           return null;
       }
       Node tempHead=head;
      for(int i=0;i<=index;i++)
        {
            tempHead=tempHead.next;
        }
      return tempHead;
    }
   // public void insert()
   public void insert(int index,int value){
    
   }
    public int getLength() {
        return length;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "length=" + length +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }

}
