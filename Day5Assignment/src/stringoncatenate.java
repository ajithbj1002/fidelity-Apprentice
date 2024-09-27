import java.util.Scanner;

public class stringoncatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter the Last name: ");
        String lastName = sc.nextLine();
        System.out.println("Full Name: "+firstName+" "+lastName);
    }
}
