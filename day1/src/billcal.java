public class billcal {


    private static final int PRICE_PER_PIZZA = 200;
    private static final int PRICE_PER_PUFF = 40;
    private static final int PRICE_PER_PEPSI = 120;

    public static void calculateBill(int pizzas, int puffs, int pepsis) {
        int totalCostPizzas = pizzas * PRICE_PER_PIZZA;
        int totalCostPuffs = puffs * PRICE_PER_PUFF;
        int totalCostPepsis = pepsis * PRICE_PER_PEPSI;
        int grandTotal = totalCostPizzas + totalCostPuffs + totalCostPepsis;

        System.out.println("Bill Details:");
        System.out.println("Total cost of pizzas: Rs." + totalCostPizzas);
        System.out.println("Total cost of puffs: Rs." + totalCostPuffs);
        System.out.println("Total cost of pepsis: Rs." + totalCostPepsis);
        System.out.println("Grand Total: Rs." + grandTotal);
    }

    public static void main(String[] args) {

        int numberOfPizzas = 5;
        int numberOfPuffs = 6;
        int numberOfPepsis = 2;

        calculateBill(numberOfPizzas, numberOfPuffs, numberOfPepsis);
    }
}
