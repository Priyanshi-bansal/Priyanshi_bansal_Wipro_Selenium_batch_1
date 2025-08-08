package day_1;

public class ShoppingInvoice {
    public static void main(String[] args) {
        long orderId = 100012345678L;
        char size = 'M';
        byte quantity = 3;
        float pricePerItem = 499.99f;
        boolean isPrimeUser = true;
        double shippingFee = isPrimeUser ? 0 : 49.99;
        short productCode = 21234;
        int pinCode = 110011;

        double totalCost = quantity * pricePerItem + shippingFee;

        System.out.println("------ Order Summary ------");
        System.out.println("Order ID      : " + orderId);
        System.out.println("Product Code  : " + productCode);
        System.out.println("Size/Qty      : " + size + " / " + quantity);
        System.out.println("Price per item: ₹" + pricePerItem);
        System.out.println("Shipping Fee  : ₹" + shippingFee);
        System.out.println("Delivery Pin  : " + pinCode);
        System.out.println("Prime Member? : " + isPrimeUser);
        System.out.println("Total Amount  : ₹" + totalCost);
    }
}
