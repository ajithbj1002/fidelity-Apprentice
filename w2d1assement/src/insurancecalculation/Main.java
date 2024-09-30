package insurancecalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insurance Number : ");
        String insuranceNo = scanner.nextLine();

        System.out.print("Insurance Name : ");
        String insuranceName = scanner.nextLine();

        System.out.print("Amount Covered : ");
        double amountCovered = scanner.nextDouble();

        System.out.print("Select \n1.Life Insurance \n2.Motor Insurance \n");
        int option = scanner.nextInt();

        Insurance insurance;
        if (option == 1) {
            lifeinsurance lifeInsurance = new lifeinsurance();
            System.out.print("Policy Term : ");
            lifeInsurance.setPolicyTerm(scanner.nextInt());
            System.out.print("Benefit Percent : ");
            lifeInsurance.setBenefitPercent(scanner.nextFloat());
            insurance = lifeInsurance;
        } else {
            motorinsurance motorInsurance = new motorinsurance();
            System.out.print("Depreciation Percent : ");
            motorInsurance.setDepPercent(scanner.nextFloat());
            insurance = motorInsurance;
        }

        insurance.setInsuranceNo(insuranceNo);
        insurance.setInsuranceName(insuranceName);
        insurance.setAmountCovered(amountCovered);

        double premium = addPolicy(insurance, option);
        System.out.printf("Calculated Premium : %.2f%n", premium);

        scanner.close();
    }

    public static double addPolicy(Insurance ins, int opt) {
        if (opt == 1) {
            return ((lifeinsurance) ins).calculatePremium();
        } else {
            return ((motorinsurance) ins).calculatePremium();
        }
    }
}
