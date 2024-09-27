import java.util.Scanner;

public class regform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the country: ");
        String country = sc.nextLine();

        System.out.println("Welcome " + name + ". Your age is " + age + " and you're from " + country + ".");
    }
}
