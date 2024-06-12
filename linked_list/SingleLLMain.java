package linked_list;

public class SingleLLMain {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList(6);
        sll.printList();
        sll.append(8);
        sll.append(9);
        sll.append(145);
        sll.printList();
        System.out.println(sll.getLength());
        System.out.println(sll.getHead().value);
        System.out.println(sll.getTail().value);
        sll.prepend(0);
        System.out.println(sll.getHead().value);
        sll.get(3);
        System.out.println(sll.get(3).value);
    }
}
