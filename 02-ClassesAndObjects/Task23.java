public class Task23 {
    public static void main(String[] args) {
        double euroBuyRate = 4.5940;
        double euroSellRate = 4.6250;
        displayBuyRate(euroBuyRate);
        displaySellRate(euroSellRate);
        double spread = calculateSpread(euroBuyRate, euroSellRate);
        displaySpread(spread);
    }

    public static double calculateSpread(double euroBuyRate, double euroSellRate)
    {
        return Math.abs(euroBuyRate - euroSellRate);
    }
    
    public static void displaySpread(double spread)
    {
        System.out.printf("Spread: %.4f%n", spread);
    }

    public static void displayBuyRate(double buyRate)
    {
        System.out.printf("Bank buys EUR: %.4f%n", buyRate);
    }
    public static void displaySellRate(double sellRate)
    {
        System.out.printf("Bank sells EUR: %.4f%n", sellRate);
    }

}
