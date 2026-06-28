public class AdapterPatternTest {

    public static void main(String[] args) {

        PaymentProcessor paypal =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripe =
                new StripeAdapter(new StripeGateway());

        PaymentProcessor razorpay =
                new RazorpayAdapter(new RazorpayGateway());

        paypal.processPayment(2500);
        stripe.processPayment(4500);
        razorpay.processPayment(6000);
    }
}