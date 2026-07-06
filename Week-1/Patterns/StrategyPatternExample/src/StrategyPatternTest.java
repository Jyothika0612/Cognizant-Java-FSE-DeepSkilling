public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(2500);

        // Change to PayPal
        context.setPaymentStrategy(new PayPalPayment());
        context.makePayment(1500);

    }

}