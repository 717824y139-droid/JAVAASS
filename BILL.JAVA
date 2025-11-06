package hotelreservation;
public class Bill {
 private Booking booking;
 private double taxRate;
 private double discount;
 private double totalAmount;
 public Bill(Booking booking, double taxRate) {
 this.booking = booking;
 this.taxRate = taxRate;
 this.discount = 0.0;
 }
 public void generateBill() {
 double baseAmount = booking.calculateTotal();
 double tax = baseAmount * taxRate;
 totalAmount = baseAmount + tax - discount;
 }
 public void displayBill() {
 System.out.println("===== Bill =====");
 System.out.println(booking);
 System.out.println("Tax: " + (taxRate * 100) + "%");
 System.out.println("Total: $" + totalAmount);
 System.out.println("================");
 }
}
