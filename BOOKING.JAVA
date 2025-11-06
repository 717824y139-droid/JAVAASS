package hotelreservation;
public class Booking {
 private static int count = 1000;
 private int bookingId;
 private Customer customer;
 private Room room;
 private int nights;
 private double totalCost;
 private String status;
 public Booking(Customer customer, Room room, int nights) {
 this.bookingId = count++;
 this.customer = customer;
 this.room = room;
 this.nights = nights;
 this.status = "Pending";
 }
 public double calculateTotal() {
 double cost = room.getPrice() * nights;
 if (customer instanceof PremiumCustomer) {
 cost = ((PremiumCustomer) customer).applyDiscount(cost);
 }
 this.totalCost = cost;
 return cost;
 }
 public void confirm() {
 room.book();
 status = "Confirmed";
 }
 public void cancel() {
 room.cancel();
 status = "Cancelled";
}
 public double getTotalCost() { return totalCost; }
 public int getBookingId() { return bookingId; }
 @Override
 public String toString() {
 return "Booking ID: " + bookingId + ", " + customer.getName() + ", Room " + 
room.getRoomNumber() +
 ", Nights: " + nights + ", Total: $" + totalCost + ", Status: " + status;
 }
}
