import java.util.Scanner;

public class votinge {

    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextInt();
        }*/
        int[] ages = {16, 18, 20, 15, 22};

        for (int age : ages) {
            if (isEligibleToVote(age)) {
                System.out.println("Age " + age + ": Eligible to vote.");
            } else {
                System.out.println("Age " + age + ": Not eligible to vote.");
            }
        }
    }
}


