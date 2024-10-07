public class LinkedList {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void removeAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            prev = current;
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }

        prev.next = current.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
