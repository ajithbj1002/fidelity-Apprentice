package linkedlistp;

public class Main {
    public static void main(String[] args) {
        Node nd = new Node(20);
        nd.next =null;
        Node nd2 = new Node(30);
        nd.next=nd2;
        System.out.println(nd);
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        System.out.println("after addFirst");
        ll.display();
        System.out.println("after addLast");
        ll.addLast(50);
        ll.display();
        ll.addAtIndex(2,60);
        System.out.println("after addAtIndex");
        ll.display();
        ll.reverse();
        System.out.println("after reverse");
        ll.display();
    }
}
