public class ObserverPatternTest {

    public static void main(String[] args) {

        // Create Stock Market
        StockMarket stockMarket = new StockMarket();

        // Create Observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register Observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change Stock Price
        System.out.println("Updating Stock Price...\n");
        stockMarket.setStock("TCS", 3850.50);

        System.out.println();

        // Remove one Observer
        stockMarket.removeObserver(webApp);

        // Change Stock Price Again
        System.out.println("Updating Stock Price Again...\n");
        stockMarket.setStock("Infosys", 1625.75);

    }

}