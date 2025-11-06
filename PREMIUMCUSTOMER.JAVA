package hotelreservation;
public class PremiumCustomer extends Customer {
 private double discountRate;
 private int loyaltyPoints;
 public PremiumCustomer(int id, String name, String email, double discountRate) {
 super(id, name, email);
 this.discountRate = discountRate;
 this.loyaltyPoints = 0;
 }
 public double applyDiscount(double amount) {
 return amount - (amount * discountRate);
 }
 public void addLoyaltyPoints(int points) {
 loyaltyPoints += points;
 }
 @Override
 public String toString() {
 return super.toString() + " [Premium - " + (discountRate * 100) + "% discount]";
 }
}
