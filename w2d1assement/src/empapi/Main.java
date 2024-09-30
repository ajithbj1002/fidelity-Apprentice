package empapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<employee> employees = new ArrayList<>();

        System.out.println("Enter employee names (type 'done' when finished):");

        while (true) {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            employees.add(new employee(name));
        }

        System.out.println("\nEmployees whose names start with 'A':");
        employees.stream()
                .filter(e -> e.getName().toLowerCase().startsWith("a"))
                .map(employee::getName)
                .forEach(System.out::println);

        sc.close();
    }
}
