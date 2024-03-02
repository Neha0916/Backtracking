public class Main {
    public static void main(String[] args) {
        singleLinkedList sll=new singleLinkedList();
        sll.createSingleLinkedList(2);
//        System.out.println(sll.head.value);
        sll.display();
        sll.insertSingleLinkedList(1,0);
        sll.display();
        sll.insertSingleLinkedList(4,2);
        sll.display();
        sll.insertSingleLinkedList(3,2);
        sll.display();
        sll.insertSingleLinkedList(5,1);
        sll.display();
        System.out.println(sll.search(8));
        sll.delete(5);
        sll.display();
    }
}