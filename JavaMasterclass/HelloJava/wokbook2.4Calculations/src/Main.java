public class Main {
    public static void main(String[] args) {
        double sales = 24309.65;
        double profit = 18562.18;
        double refunds = 688.78;
        double shipping = 1233.57;

        int sales2 = (int)sales;
        int profit2 = (int)profit;
        int refunds2 = (int)refunds;
        int shipping2 = (int)shipping;


        System.out.println("This month, we made $" + sales2 + " in sales");
        System.out.println("Factoring in costs, we made $" + profit2 + "in profit");
        System.out.println("The refunds are at a low $" + refunds2 + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + shipping2 + " in shipping");

    }
}