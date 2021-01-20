public class MyLinkedListTest {

    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(9);
        ll.addFirst(10);
        ll.addFirst(18);
        ll.addFirst(23);

        ll.add(6,9);
        ll.add(6,8);
        ll.printList();

    }
}
