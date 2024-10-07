import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four elements for the linked list:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            list.append(element);
        }

        System.out.println("Current linked list:");
        list.display();

        System.out.print("Enter the index of the element to remove (0-3): ");
        int indexToRemove = scanner.nextInt();

        list.removeAtIndex(indexToRemove);

        System.out.println("Linked list after removing element:");
        list.display();

        scanner.close();
    }
}